package com.stone.multiproject.utils;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Joiner;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@UtilityClass
@Slf4j
public class HttpHelp {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json;charset=utf8";
    private static final String CHARSET = "UTF-8";

    public String removeUnderLine(String string) {
        if (StringUtils.isBlank(string)) {
            return string;
        }
        if (string.contains("_")) {
            String[] s = string.split("_");
            char[] chars = s[1].toCharArray();
            char[] chars1 = (chars[0] + "").toUpperCase().toCharArray();
            chars[0] = chars1[0];
            chars.toString();
            return Joiner.on("").join(s).toString();
        }
        return string;
    }

    public String doGet(String url, Map<String, String> param) {
        StringBuffer params = new StringBuffer();
        if (MapUtils.isNotEmpty(param)) {
            param.entrySet().forEach(o -> {
                try {
                    params.append(o.getKey() + "=" + URLEncoder.encode(o.getValue(), "utf-8"));
                    params.append("&");
                } catch (Throwable e) {
                    log.error(StringUtils.EMPTY, e);
                }
            });
        }
        HttpGet httpGet = new HttpGet(url + "?" + params);
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)
                .setConnectionRequestTimeout(5000)
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true).build();
        httpGet.setConfig(requestConfig);
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build();
             CloseableHttpResponse response = httpClient.execute(httpGet);
        ) {
            HttpEntity responseEntity = response.getEntity();
            log.info("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                return EntityUtils.toString(responseEntity);
            }
        } catch (Throwable e) {
            log.error(StringUtils.EMPTY, e);
        }
        return null;
    }

    public void doPost(String url, Object param) {
        if (StringUtils.isBlank(url)) {
            return;
        }
        HttpPost httpPost = new HttpPost(url);
        if (param != null) {
            StringEntity entity = new StringEntity(JSON.toJSONString(param), CHARSET);
            httpPost.setEntity(entity);
        }
        httpPost.setHeader(CONTENT_TYPE, CONTENT_TYPE_VALUE);
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build();
             CloseableHttpResponse response = httpClient.execute(httpPost)){
            HttpEntity responseEntity = response.getEntity();
            log.info("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                log.info("响应内容长度为:" + responseEntity.getContentLength());
                log.info("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (Throwable e) {
            log.error(StringUtils.EMPTY, e);
        }
    }
}

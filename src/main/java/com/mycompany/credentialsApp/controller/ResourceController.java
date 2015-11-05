package com.mycompany.credentialsApp.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;
import java.util.*;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

    @RequestMapping(value = "list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<IDRes> resolve() {
        List<IDRes> a = new ArrayList<>();
        Set<Resource> result = new LinkedHashSet<>();
        ClassLoader cl = resolver.getClassLoader();
        String path = "static";

        Enumeration<URL> resourceUrls = null;
        try {
            resourceUrls = (cl != null ? cl.getResources(path) : ClassLoader.getSystemResources(path));

            while (resourceUrls.hasMoreElements()) {
                URL url = resourceUrls.nextElement();
                result.add(convertClassLoaderURL(url));
            }
            for (Resource r : result) {
                a.add(new IDRes(r.getFile().getAbsolutePath(), r.getURL().toString()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return a;
    }

    protected Resource convertClassLoaderURL(URL url) {
        return new UrlResource(url);
    }

    class IDRes {
        public final String path;
        public final String url;


        public IDRes(String path, String url) {
            this.path = path;
            this.url = url;
        }
    }

}

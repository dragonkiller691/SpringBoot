package com.boot.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
//
//                        //OR//
//
//        new SpringApplicationBuilder()
//                .profiles("dev")
//                .bannerMode(Banner.Mode.OFF)
//                .sources(SimpleApplication.class)
//                .child(OtherConfig.class)
//                .logStartupInfo(false)
//                .web(WebApplicationType.NONE)
//                .run(args);
    }
//
//    @Component
//    class MyComponent {
//        @Autowired
//        public MyComponent(ApplicationArguments args) {
//            boolean enable = args.containsOption("enable");
//            Logger log = LoggerFactory.getLogger(MyComponent.class);
//            if (enable)
//                log.info("## > You are enabled!");
//            List<String> _args = args.getNonOptionArgs();
//            log.info("## > extra args ...");
//            if (!_args.isEmpty())
//                _args.forEach(log::info);
//        }
//    }

}

//@SpringBootApplication
//public class SimpleApplication { //implements CommandLineRunner { //, ApplicationRunner {
//
////    private final Logger log = LoggerFactory.getLogger(SimpleApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(SimpleApplication.class, args);
//    }

//    @Bean
//    String info(){
//        return "Just a simple String bean";
//    }
//
//    @Autowired
//    String info;

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        log.info("## > ApplicationRunner Implementation...");
//        log.info("Accessing the Info bean: " + info);
//        args.getNonOptionArgs().forEach(log::info);
//    }

//    @Override
//    public void run(String... args) throws Exception {
//        log.info("## > CommandLineRunner Implementation...");
//        log.info("Accessing the Info bean: " + info);
//        for(String arg:args)
//            log.info(arg);
//    }

//    @Bean
//    CommandLineRunner myMethod(){
//        return args -> {
//            log.info("## > CommandLineRunner Implementation...");
//            log.info("Accessing the Info bean: " + info);
//            for(String arg:args)
//                log.info(arg);
//        };
//    }
//}

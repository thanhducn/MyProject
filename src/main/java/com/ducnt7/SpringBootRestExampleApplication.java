package com.ducnt7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class SpringBootRestExampleApplication{
    //private final Faker faker = new Faker();

    //private final Faker faker = new Faker();

//    @Bean
//    public Docket managementDocket(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("my-project").apiInfo(apiInfo()).select().paths( PathSelectors.any()).build();
//    }

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(SpringBootRestExampleApplication.class, args);
        // use Spark framework
        // get("/hello", (req, res) -> "Hello World");
    }

//    @Bean
//    public Docket newsApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("my-project")
//                .apiInfo(apiInfo())
//                .select()
//                .paths(PathSelectors.regex("/search"))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring REST Sample with Swagger")
//                .description("Spring REST Sample with Swagger")
//                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
//                .contact("Niklas Heidloff")
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
//                .version("2.0")
//                .build();
//    }

//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("My-project").description("Document for API").termsOfServiceUrl("https://localhost:8080/").contact("DucNT7").license("Proprietary").licenseUrl("https://localhost:8080/").version("1.0").build();
//    }

    //public static void main(String[] args) {
    //    SpringApplication.run(SpringBootRestExampleApplication.class, args);
    //}

//    @Bean
//    public CommandLineRunner initializeDb(PieRepository repository) {
//        return (args) -> {
//            repository.deleteAll();
//            //Insert some random pies
//            for (int i = 0; i < 20; i++) {
//                repository.save(new Pie(faker.lorem().word(), faker.lorem().sentence()));
//            }
//        };
//    }

//    @Bean
//    public Docket swaggerSettings() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .pathMapping("/");
////                .groupName("greetings")
////                .apiInfo(apiInfo())
////                .select()
////                .paths(regex("/greeting.*"))
////                .build();
//    }
}

package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionFive;

import io.swagger.annotations.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





@Configuration
@EnableSwagger2
public class swaggerConfiguration {

//    public static final Contact DEFAULT_CONTACT =  new Contact("Deepak kalra", "http://tothenew.com", "deepak.kalra1@tothenew.com");
//    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("RestFul Api ",
//            "RestFul api part 2 Documentation", "1.0", "urn:tos",
//            DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

    @Bean
   public Docket api(){
        //since contact is nt workinng so i have simply created a docket without changing the info
        //return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
        return new Docket(DocumentationType.SWAGGER_2);
    }
}

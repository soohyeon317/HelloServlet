package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

//	@Bean // 스프링 빈으로 직접 등록한다.
//	SpringMemberFormControllerV1 springMemberFormControllerV1() {
//		return new SpringMemberFormControllerV1();
//	}

}

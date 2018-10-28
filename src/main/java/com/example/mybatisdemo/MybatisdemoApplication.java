package com.example.mybatisdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
@MapperScan("com.example.mybatisdemo.persistence.auto.mapper")
public class MybatisdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisdemoApplication.class, args);
        log.info(notBug());
    }
    private static String notBug (){
        String str = "\n" +
                "/**\n" +
                "                   _oo0oo_\n" +
                "                  o8888888o\n" +
                "                  88\" . \"88\n" +
                "                  (| -_- |)\n" +
                "                  0\\  =  /0\n" +
                "                ___/`---'\\___\n" +
                "              .' --|     |-- '.\n" +
                "             / --|||  :  |||-- \\\n" +
                "            / _||||| -:- |||||- \\\n" +
                "           |   | \\--  -  --/ |   |\n" +
                "           | \\_|  ''\\---/''  |_/ |\n" +
                "           \\  .-\\__  '-'  ___/-. /\n" +
                "         ___'. .'  /--.--\\  `. .'___\n" +
                "      .\"\" '<  `.___\\_<|>_/___.' >' \"\".\n" +
                "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
                "     \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /\n" +
                " =====`-.____`.___ \\_____/___.-`___.-'=====\n" +
                "                   `=---=`\n" +
                "\n" +
                " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "\n" +
                "             佛祖保佑     永无BUG\n" +
                " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                " \n" +
                " **/";
        return str;
    }

}

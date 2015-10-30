package com.hh;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by hh on 15-10-30.
 *需要引入servlet.jar
 */
public class MyTaglib  extends TagSupport{
    private String name;//需要对参数写get,set方法
    private int age;
    @Override
    public int doStartTag() throws JspException {
        return super.doStartTag();
    }

    /**
     * EVAL_BODY_INCLUDE：把Body读入存在的输出流中，doStartTag()函数可用
     * EVAL_PAGE：继续处理页面，doEndTag()函数可用
     * SKIP_BODY：忽略对Body的处理，doStartTag()和doAfterBody()函数可用
     * SKIP_PAGE：忽略对余下页面的处理，doEndTag()函数可用
     * EVAL_BODY_TAG：已经废止，由EVAL_BODY_BUFFERED取代
     * EVAL_BODY_BUFFERED：申请缓冲区，由setBodyContent()函数得到的BodyContent对象来处理tag的body，如果类实现了BodyTag，那么doStartTag()可用，否则非法
     * @return
     * @throws JspException
     */
    @Override
    public int doEndTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print("你输入的是："+name+",年龄是："+age);
        }catch (IOException e){

        }
        return EVAL_BODY_INCLUDE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

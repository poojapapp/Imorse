package com.imorse.imorsedemo.interfaces;

public  interface InterfaceConstants {
    interface Url {
        String ApiBaseUrlLocal = "http://aimanashik.org/wp-json/api/";

    }
    interface apiValidateResponse {
        String connection_timeout="Connection timeout";
        String nointernet="no internet";
        String server_not_responding="server not responding";
        String parse_error="Response parse error";
    }
    interface  apiResponseStatus{
        int OK =200;
    }
    interface toastMessage {
        String oppose_something_went_wrong = "Oppose something went wrong Please try again";
        String no_internet_connection = "No internet connection";
        String can_not_post_empty_blog_title = "Can not post empty blog title";
        String can_not_post_empty_blog_description = "Can not post empty blog description";
        String can_not_post_empty_blog = "Can not post empty blog";
        String can_not_post_empty_blog_day = "Can not post empty blog day";
    }
}

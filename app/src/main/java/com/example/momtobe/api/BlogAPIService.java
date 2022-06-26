package com.example.momtobe.api;

import com.example.momtobe.remote.Blog;
import com.example.momtobe.remote.Embedded;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BlogAPIService {

    @GET("blogs")
    Call<List<Blog>> getAllBlogs();

    @GET("blogs")
    Call<Embedded> getBlogList();

    @GET("blogs/{id}")
    Call<Blog> getOneBlog(@Query("id") String blogId);
}

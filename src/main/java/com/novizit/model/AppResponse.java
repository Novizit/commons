package com.novizit.model;

public record AppResponse<T>(
	  T content,
      String previousPageCursor,
      String nextPageCursor
) {}

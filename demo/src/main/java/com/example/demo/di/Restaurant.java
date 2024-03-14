package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Component
@Data
@RequiredArgsConstructor
@Scope() // singletone(기본), prototype, request, session
public class Restaurant {
//	@Setter(onMethod_ = {@Autowired})

	final private Chef chef;

}

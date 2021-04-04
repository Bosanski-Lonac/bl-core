module bl_core {
	exports enums;
	exports utility;
	exports dto;

	requires transitive java.sql;
	requires transitive java.validation;
	requires transitive spring.core;
	requires transitive spring.web;
}
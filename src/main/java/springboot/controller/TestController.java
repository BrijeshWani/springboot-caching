package springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.cache.CacheService;

@RestController
@RequestMapping("/maths")
public class TestController {

	@Autowired
	private CacheService cacheService;

	@GetMapping("/get-table/{number}")
	public @ResponseBody ResponseEntity<List<Integer>> getTable(@PathVariable Integer number) {
		return ResponseEntity.status(HttpStatus.OK).body(cacheService.getTableOfNumber(number));
	}

	@GetMapping("/add/{number1}/{number2}")
	public @ResponseBody ResponseEntity<Integer> add(@PathVariable Integer number1, @PathVariable Integer number2) {
		return ResponseEntity.status(HttpStatus.OK).body(cacheService.add(number1, number2));
	}
}

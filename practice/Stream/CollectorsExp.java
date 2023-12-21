package com.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExp {

	private String name;
	private double temperature;
	
	public CollectorsExp(String name, double temperature) {
		super();
		this.name = name;
		this.temperature = temperature;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
		return name + "-->" + temperature;
	}
	
	private static List<CollectorsExp> prepareTemperature() {
		
		List<CollectorsExp> cities = new ArrayList<CollectorsExp>();
		
	    cities.add(new CollectorsExp("New Delhi", 33.5)); 
	    cities.add(new CollectorsExp("Mexico", 14)); 
	    cities.add(new CollectorsExp("New York", 13)); 
	    cities.add(new CollectorsExp("Dubai", 43)); 
	    cities.add(new CollectorsExp("London", 15)); 
	    cities.add(new CollectorsExp("Alaska", 1)); 
	    cities.add(new CollectorsExp("Kolkata", 30)); 
	    cities.add(new CollectorsExp("Sydney", 11)); 
	    cities.add(new CollectorsExp("Mexico", 14)); 
	    cities.add(new CollectorsExp("Dubai", 43)); 
		return cities;
		
	}
	
	public static void main(String[] args) {
//		City city = new City("Pune", 25);
//		System.out.println(city.getName());
//		System.out.println(city.getTemperature());
//		System.out.println(city.prepareTemperature());
		
		// toList
		prepareTemperature().stream()
		.filter(x->x.getTemperature()>10)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		// toSet
		System.out.println(prepareTemperature().stream().map(x->x.getName())
		.collect(Collectors.toSet()));
		
		// toCollection
		System.out.println(prepareTemperature() 
                .stream() 
                .map(f -> f.getName()) 
                .collect(Collectors.toCollection(ArrayList<String>::new)));
		
		// duplicate <K,V> pairs are ignored
		System.out.println(prepareTemperature()
				.stream()
				.collect(Collectors.toMap(CollectorsExp::getName, CollectorsExp::getTemperature
						, (key, identicalKey)->key)));
		
		// grouping by and counting
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingBy(CollectorsExp::getName, Collectors.counting())));
		
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingBy(CollectorsExp::getName)));
		
		// counting
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.counting()));
		
		// collectingAndThen - grouping and counting each city
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingBy(CollectorsExp::getName, 
						Collectors.collectingAndThen(Collectors.counting(), f->f.intValue()))));
		
		// joining - how to print 
		System.out.println(prepareTemperature().stream()
				.map(x->x.getName()).collect(Collectors.joining(", ")));
		
		// joining
		System.out.println(prepareTemperature().stream()
				.map(x->x.getName()).collect(Collectors.joining(" ")));
		
		// mapping
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingBy(CollectorsExp::getName, 
						Collectors.mapping(CollectorsExp::getTemperature, 
								Collectors.toList()))));
		
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingBy(CollectorsExp::getName, 
						Collectors.mapping(CollectorsExp::getTemperature, 
							Collectors.toSet()))));
		
		// partitioning by
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.partitioningBy(city->city.getTemperature()>15)));
		
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.partitioningBy(
						city->city.getTemperature()>10, Collectors.toList())));
		
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.partitioningBy(
						city->city.getTemperature()>10, Collectors.toSet())));
		
		// averagingDouble
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.averagingDouble(CollectorsExp::getTemperature)));
		
		System.out.println(prepareTemperature().stream()
				.collect(Collectors.groupingByConcurrent(x->x.getTemperature()>15)));
		
		System.out.println(prepareTemperature().stream().map(x->x.getTemperature())
				.collect(Collectors.maxBy(Comparator.naturalOrder())));
		
	}

}

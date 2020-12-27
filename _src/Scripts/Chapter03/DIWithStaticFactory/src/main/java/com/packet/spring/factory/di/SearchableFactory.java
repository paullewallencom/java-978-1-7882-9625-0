package com.packet.spring.factory.di;

public class SearchableFactory {

	private static SearchableFactory searchableFactory;
	
	//Static Factory method to get instance of Searchable Factory.
	public static SearchableFactory getSearchableFactory() {
		if(searchableFactory == null) {
			searchableFactory = new SearchableFactory();
		}
		System.out.println("Factory method is used: getSearchableFactory() ");
		return searchableFactory;
	}
	
}

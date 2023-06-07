package com.builder;


	
	
	public class BuilderMainTesting {
		
		public static void main(String[] args) {
			
			
			Actor actor = new Actor.ActorBuilder(101, "Arjun Kumar", "Male", 25).build();
			
			System.out.println("Actor info : " + actor);
			
			
			
		}

	}

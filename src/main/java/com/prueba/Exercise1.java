package com.prueba;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Exercise1 {

	public static void main(String[] args) {
		
		//El FLux simplifica todo lo hecho con el observable
		
		//Mono<String> helloWorld = Mono.just("Hello World !");
				
	
		Flux<String> message = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		//Observable<String> message = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		Observer<String> ob1 = new Observer<String>() {
			
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Empiezo ");
				
			}
			
			@Override
			public void onNext(String t) {
				System.out.println("Empiezo y añado " + t);
				
			}
			
			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Holaaaaaaa " + e.getMessage());
			}
			
			@Override
			public void onComplete() {
				System.out.println("Completado ");
				
			}
		};
		
		Observer<String> ob2 = new Observer<String>() {
			
			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onNext(String t) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//Para observer
		//message.subscribe(ob1);
		
		//Para FLux
		message.subscribe(mensaje -> System.out.println("Mostrando " + mensaje));
	}

}

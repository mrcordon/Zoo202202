import model.Cat;
import model.Nuthatch;
import model.Snake;
import model.Dog;
import model.Fish;
import model.Turkey;
import model.Fox;
import model.Bat;
import model.Blobfish;

public class AnimalNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Cat garfield = new Cat();
		System.out.println(garfield.speak());
		
		Nuthatch noona = new Nuthatch();
		System.out.println(noona.speak());
    
		Dog brian = new Dog();
		System.out.println(brian.speak());
		
		Turkey tom = new Turkey();
		System.out.println(tom.speak());
		
		Fox tod = new Fox();
		System.out.println(tod.speak());
		
		Bat zubat = new Bat();
		System.out.println(zubat.makeNoise());
		
		Snake python = new Snake();
		System.out.println(python.makeNoise());
		
		Fish craoker = new Fish();
		System.out.println(craoker.makeNoise());

		Blobfish blobby = new Blobfish();
		System.out.println(blobby.makeNoise());

	}

}

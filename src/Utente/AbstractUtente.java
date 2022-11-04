package Utente;

import java.util.Objects;

public abstract class AbstractUtente implements IUtente {

		//dichiarazione degli attributi funzionali
		private int age;								//variabile utilizzata per l'eta
		private String name;							//variabile utilzzata per il nome
		private String surname;							//variabile utilzzata per il cognome
		private boolean gender;							//variabile utilizzata per il genere
														//TRUE = Maschio, FALSE = Femmina
		
		/**
		 * Costruttore
		 * @param age
		 * @param name
		 * @param surname
		 * @param gender
		 */
		public AbstractUtente(int age,String name,String surname,boolean gender) {
			//inizializzo il costruttore della classe padre
			super();
			//inizializzo gli attributi funzionali
			this.age 		= age;
			this.name 		= name;
			this.surname 	= surname;
			this.gender 	= gender;
		}//end costruttore cliente
		
		//INERFACCIA PUBBLICA DELLA CLASSE
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
			return result;
			//return Objects.hash(age, gender, name, surname);
		}//end hashCode

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AbstractUtente other = (AbstractUtente) obj;
			return age == other.age && gender == other.gender && Objects.equals(name, other.name)
					&& Objects.equals(surname, other.surname);
		}//end equals
		
		//Metodi dell'interfaccia
		
		/**
		 * Metodo per otterene l'età
		 * @return age
		 */
		@Override
		public int getAge() {
			return this.age;
		}//end getAge

		/**
		 * Metodo per ottenere il nome
		 * @return name
		 */
		@Override
		public String getName() {
			return this.name;
		}//end getName

		/**
		 * Metodo per ottenere il cognome
		 * @return surname
		 */		
		@Override
		public String getSurname() {
			return this.surname;
		}//end getSurname

		/**
		 * Metodo per ottenere il genere
		 * @return gender
		 */
		@Override
		public boolean getGender() {
			return this.gender;
		}//end getGender
		
		@Override
		public String toString() {
			return "Cliente : [age=" + age + ", name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
		}//end toString

}//end AbstractUtente

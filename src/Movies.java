
public class Movies {
	//data members (instance variables)
		private String movieName;
		private int rating;
		private String category;
		
		//constructor
		public Movies (String n, int r, String c) {
			movieName = n;
			rating = r;
			category = c;
		}

		//getters/accessors
		public String getName() {
			return movieName;
		}

		public int getRating() {
			return rating;
		}

		public String getCategory() {
			return category;
		}

		//setters/mutators
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}
		
		public void setCategory(String category) {
			this.category = category;
		}
		
		public String toString () {
			return movieName + " (" + rating + ")\t\t" + category;
		}
	}
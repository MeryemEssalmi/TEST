public class cellule {
		//construction de la cellule de cordonn�es(x,y)
		private int x;
		private int y;
		 public cellule(int x,int y) {
		        this.x=x;
		        this.y=y;
		    }
		 //m�thode des getter pour renvoyer la cordonn�e en x
		 public int getx() {
		        return this.x;
		    }
		 //m�thode des getter pour renvoyer la cordonn�e en y
		 public int gety() {
		        return this.y;
		    }
		//m�thode des setter pour renvoyer la cordonn�e en x
		 public void setx(int x) {
		        this.x=x;
		    }
		//m�thode des setter pour renvoyer la cordonn�e en y
		 public void sety(int y) {
		      	this.y=y;
		    }
}


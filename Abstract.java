

abstract class Shape
	{
	abstract void numberOfSides();
	}
		class Rectangle extends Shape
		{
			int side;
			Rectangle(int side)
			{
				this.side=side;
			}
			public void numberOfSides()
		{
			System.out.println("I'm Rectangle,Number of Sides = "+side);
		}
		}
		class Triangle extends Shape
		{
			int side;
			Triangle(int side)
			{
				this.side=side;
			}
			public void numberOfSides()
			{
				System.out.println("I'm Triangle,Number of Sides = "+ side);
			}
		}
		class Hexagon extends Shape
		{
			int side;
				Hexagon(int side)
				{
					this.side=side;
				}
				public void numberOfSides(){
					System.out.println("I'm Hexagon,Number of Sides = "+side);
				}
		}
		public class Abstract{

				public static void main(String args[]){
				Rectangle r = new Rectangle(4);
				Triangle t = new Triangle(3);
				Hexagon h = new Hexagon(6);
				r.numberOfSides();
				t.numberOfSides();
				h.numberOfSides();

				}
		}

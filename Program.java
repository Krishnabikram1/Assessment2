import java.util.*;

	public class Program
	{
		static void main(String[] args)
		{
			clsTemparature objTemp = new clsTemparature(); //Task 1
			objTemp.GetSensorData();
			// clsSeatArrager objclsSeatArrager = new clsSeatArrager();  //Task 2
			// objclsSeatArrager.GetStudentInfo();
			new Scanner(System.in).nextLine();
		}
	}
	public class clsTemparature
	{
		private ArrayList<String> lstGivenData = new ArrayList<String>();
		private int splitDuration = 1; //1 sec
		public final void GetSensorData()
		{
			System.out.println("Enter Temparature divide by '-' ");
			String data = new Scanner(System.in).nextLine();
			lstGivenData = data.split("[-]", -1).ToList();

			ArrayList<TemparatureData> lstTtempdata = new ArrayList<TemparatureData>();

			for (int i = 0; i < lstGivenData.size(); i++)
			{
				ArrayList<Object> splitdata = lstGivenData.get(i).split("[,]", -1).ToList();

				TemparatureData tempVar = new TemparatureData();
				tempVar.setSensorID((Integer)splitdata.get(0));
				tempVar.setMseconds((Integer)splitdata.get(1));
				tempVar.setTemparature((Integer)splitdata.get(2));
				lstTtempdata.add(tempVar);

			}
			ArrayList<Integer> lstAvg1 = new ArrayList<Integer>();
			ArrayList<Integer> lstAvg2 = new ArrayList<Integer>();
			ArrayList<Integer> lstAvg3 = new ArrayList<Integer>();
			ArrayList<Integer> lstAvg4 = new ArrayList<Integer>();

			for (int i = 0; i < lstTtempdata.size(); i++)
			{
				if (lstTtempdata.get(i).getMseconds() >= 10000 && lstTtempdata.get(i).getMseconds() <= 10999)
				{
					lstAvg1.add(lstTtempdata.get(i).getTemparature());
				}
				if (lstTtempdata.get(i).getMseconds() >= 11000 && lstTtempdata.get(i).getMseconds() <= 11999)
				{
					lstAvg2.add(lstTtempdata.get(i).getTemparature());
				}
				if (lstTtempdata.get(i).getMseconds() >= 12000 && lstTtempdata.get(i).getMseconds() <= 12999)
				{
					lstAvg3.add(lstTtempdata.get(i).getTemparature());
				}
				if (lstTtempdata.get(i).getMseconds() >= 13000 && lstTtempdata.get(i).getMseconds() <= 13999)
				{
					lstAvg4.add(lstTtempdata.get(i).getTemparature());
				}

			}

			System.out.println("10000-10999 :" + lstAvg1.Select(x -> x).Average());
			System.out.println("11000-11999 :" + lstAvg2.Select(x -> x).Average());
			System.out.println("12000-12999 :" + lstAvg3.Select(x -> x).Average());
			System.out.println("13000-13999 :" + lstAvg4.Select(x -> x).Average());
		}

	}

	public class TemparatureData
	{
		private int SensorID;
		public final int getSensorID()
		{
			return SensorID;
		}
		public final void setSensorID(int value)
		{
			SensorID = value;
		}
		private int Mseconds;
		public final int getMseconds()
		{
			return Mseconds;
		}
		public final void setMseconds(int value)
		{
			Mseconds = value;
		}
		private int Temparature;
		public final int getTemparature()
		{
			return Temparature;
		}
		public final void setTemparature(int value)
		{
			Temparature = value;
		}
	}

	public class clsSeatArrager
	{
		public final void GetStudentInfo()
		{
			System.out.println("number_of_students ");
			int noStudents = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.println("number_of_chairs ");
			int noChairs = Integer.parseInt(new Scanner(System.in).nextLine());

			seating_arrangement(noStudents, noChairs);
		}
		private void seating_arrangement(int number_of_students, int number_of_chairs)
		{
			int no_rows = 2;
			int row_first = (number_of_chairs / 2);
			String[] student_types = new String[] {"Math", "Physics", "Chemistry"};

			String[] students_writing = new String[] { };

			int students_writing1 = (number_of_students / 3) * 3;

			if (number_of_students <= number_of_chairs)
			{
				if (number_of_students > 0)
				{
					for (int i = 0; i < number_of_students; i++)
					{

					}
				}
			}
			else
			{
				System.out.println("Need More Chairs");
			}
		}
	}

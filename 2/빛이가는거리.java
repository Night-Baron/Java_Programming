public class 빛이가는거리{
	public static void main(String args[]){
		long lightspeed;
		long distance;
		double dist_f;

		lightspeed = 300_000;
		distance = lightspeed * 365L * 24 * 60 * 60;
		dist_f = (double) distance;

		System.out.println("빛이 1년 동안 가는 거리: " + distance + " km.");
		System.out.printf("빛이 1년 동안 가는 거리: %e km.\n", dist_f);
	}
}

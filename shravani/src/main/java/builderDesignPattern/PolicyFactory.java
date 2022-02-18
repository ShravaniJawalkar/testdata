package builderDesignPattern;

public class PolicyFactory {

	public Policy getInstance(String name) {
		if(name.equals("travel"))
			return new TravelPolicyFactory();
		else if(name.equals("health"))
			return new HealthPolicyFactory();
		else
			return new MotorPolicyFactory();
	}
}

package how.to.program.chapter6;

import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

/**
 * Created by Пользователь on 02.07.2017.
 */
public class RandomNumbersExperiment {
    public static void main(String[] args) {
        SecureRandom random =new SecureRandom();
        System.out.println(random.getAlgorithm());


        Provider[] providersList = Security.getProviders();
        for(int i=0;i<providersList.length;i++){
            System.out.println(providersList[i].toString());
        }
    }
}

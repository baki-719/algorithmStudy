package kakaocommerce;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class GiftCard {
    public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;

        Map<Integer, Long> numberCountMap = Arrays.stream(gift_cards)
                .boxed()
                .collect(groupingBy(Integer::intValue, counting()));

        for (int i = 0; i < wants.length; i++) {
            if(numberCountMap.containsKey(wants[i]) && numberCountMap.get(wants[i]) > 0)
                numberCountMap.put(wants[i], numberCountMap.get(wants[i])-1);
            else answer++;
        }

        return answer;
    }
}

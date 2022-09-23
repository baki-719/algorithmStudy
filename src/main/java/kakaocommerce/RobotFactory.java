package kakaocommerce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class RobotFactory {
    public int solution(int[][] needs, int r) {
        int answer = 0;
        List<Parts> partsList = new ArrayList<>();

        for (int i = 0; i < needs[0].length; i++) {
            int partsSum = 0;
            for (int j = 0; j < needs.length; j++) {
                partsSum += needs[j][i];
            }
            partsList.add(new Parts(i, partsSum));
        }

        Set<Integer> robotSet = partsList.stream()
                .sorted(Comparator.comparing(Parts::getNeedPartsCount).reversed())
                .limit(r)
                .map(Parts::getPartsNo)
                .collect(toSet());

        for (int i = 0; i < needs.length; i++) {
            for(int j = 0; j < needs[i].length; j++) {
                if(needs[i][j] == 1 && !robotSet.contains(j)) break;
                if(j == needs[i].length-1) {
                    if((needs[i][j] == 1 && robotSet.contains(j)) || (needs[i][j] == 0))
                        answer++;
                }
            }
        }

        return answer;
    }

    class Parts {
        int partsNo;
        int needPartsCount;

        public Parts(int partsNo, int needPartsCount) {
            this.partsNo = partsNo;
            this.needPartsCount = needPartsCount;
        }

        public int getNeedPartsCount() {
            return needPartsCount;
        }

        public int getPartsNo() {
            return partsNo;
        }

        @Override
        public String toString(){
            return "partsNo : " + partsNo + " / needPartsCount" + needPartsCount;
        }
    }
}

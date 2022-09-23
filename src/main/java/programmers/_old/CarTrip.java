package programmers._old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarTrip {
        public int solution(int[] P, int[] S) {
            // write your code in Java SE 8
//            List<Car> carList = makeCarList(P,S).stream()
//                    .sorted(Comparator.comparing(Car::getSeat).reversed())
//                    .collect(Collectors.toList());
//
//            for(int i = 0; i < carList.size()-1; i++) {
//                Car tempCar = carList.get(i);
//                if(tempCar.hasFreeSeat()) {
//                    for(int j = i+1; j < carList.size(); j++) {
//                        if(tempCar.getFreeSeat() >= carList.get(j).getPeople()) {
//                            tempCar.addPeople(carList.get(j).getPeople());
//                            carList.get(j).addPeople(-1 * carList.get(j).getPeople());
//                        } else {
//
//                        }
//                    }
//                }
//
//            }

            int totalPeople = Arrays.stream(P).sum();

            Integer[] seatArr = Arrays.stream(S).boxed().toArray(Integer[] :: new);
            Arrays.stream(seatArr).sorted(Comparator.reverseOrder());

            for(int i = 0; i < seatArr.length; i++) {
                totalPeople -= seatArr[i];
                if(totalPeople < 0) return i;
            }

            return 0;
        }

        private List<Car> makeCarList(int[] P, int[] S) {
            List<Car> carList = new ArrayList<>();

            for(int i = 0; i < P.length; i++) {
                carList.add(new Car(P[i], S[i]));
            }

            return carList;
        }

        class Car {
            int people;
            int seat;

            public Car(int people, int seat) {
                this.people = people;
                this.seat = seat;
            }

            public int getPeople(){
                return people;
            }

            public int getSeat(){
                return seat;
            }

            public boolean hasFreeSeat() {
                return seat > people;
            }

            public int getFreeSeat() {
                return seat - people;
            }

            public void addPeople(int people) {
                this.people += people;
            }
        }

}

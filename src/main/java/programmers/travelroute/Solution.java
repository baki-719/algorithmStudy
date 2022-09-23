package programmers.travelroute;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private List<String> route;
    private List<Ticket> ticketList;
    private String[] answer;

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        route = new ArrayList<>();
        ticketList = Arrays.stream(tickets)
                .map(Ticket::new)
                .sorted()
                .collect(Collectors.toList());

        route.add("ICN");

        ticketList.stream()
                .filter(nextTicket -> nextTicket.departure.equals("ICN") && !nextTicket.isUsed)
                .sorted()
                .forEach(nextTicket -> {
                    nextTicket.isUsed = true;
                    dfs(nextTicket);
                    nextTicket.isUsed = false;
                    route.remove(route.size()-1);
                });

        return answer;
    }

    private void dfs(Ticket usingTicket) {
        route.add(usingTicket.arrive);

        if (route.size() == ticketList.size()+1 && answer[answer.length-1] == null) {
            for(int i = 0 ; i < route.size(); i++) {
                answer[i] = route.get(i);
            }
            return;
        }

        ticketList.stream()
                .filter(nextTicket -> nextTicket.departure.equals(usingTicket.arrive) && !nextTicket.isUsed)
                .sorted()
                .forEach(nextTicket -> {
                    nextTicket.isUsed = true;
                    dfs(nextTicket);
                    nextTicket.isUsed = false;
                    route.remove(route.size()-1);
                });
    }
}

class Ticket implements Comparable<Ticket> {
    public String departure;
    public String arrive;
    public boolean isUsed;

    public Ticket(String[] ticket) {
        this.departure = ticket[0];
        this.arrive = ticket[1];
        isUsed = false;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.arrive.compareTo(o.arrive);
    }
}

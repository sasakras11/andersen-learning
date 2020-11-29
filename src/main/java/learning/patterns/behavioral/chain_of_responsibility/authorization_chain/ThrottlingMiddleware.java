package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;

public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private Long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String pass) {
        if(System.currentTimeMillis()> currentTime + 60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;

        if(request > requestPerMinute){
            System.out.println("request limit exceeded");
            Thread.currentThread().stop();
        }
        return checkNext(email,pass);
    }
}

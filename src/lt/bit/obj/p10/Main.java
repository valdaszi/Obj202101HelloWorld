package lt.bit.obj.p10;

import java.util.Currency;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // BaseEntity baseEntity = new BaseEntity();
        Client client = new Client();

        BaseEntity baseEntity = client;
        baseEntity.setId(101);

        IBankExchangeRate bankExchangeRate = getBank();

        Request request = new Request(new Date(), "USD");
        ICurrencyExchangeRateResponse rateResponse = bankExchangeRate.getExchangeRate(request);
        System.out.println("Exchange rate = " + rateResponse.getExchangeRate());
    }

    static IBankExchangeRate getBank() {
        //TODO??
        return new BankLT(); // new BankECB();
    }
}

class BankLT implements IBankExchangeRate {
    //TODO...


    @Override
    public ICurrencyExchangeRateResponse getExchangeRate(ICurrencyExchangeRateRequest request) {
        return new Response();
    }

    class Response implements ICurrencyExchangeRateResponse {

        @Override
        public double getExchangeRate() {
            //TODO.....
            return 1.0666;
        }
    }
}

class BankECB implements IBankExchangeRate {
    // TODO...


    @Override
    public ICurrencyExchangeRateResponse getExchangeRate(ICurrencyExchangeRateRequest request) {
        return new Response();
    }

    class Response implements ICurrencyExchangeRateResponse {

        @Override
        public double getExchangeRate() {
            //TODO.....
            return 1.0234;
        }
    }
}


class Request implements ICurrencyExchangeRateRequest {

    private Date date;
    private String currency;

    public Request(Date date, String currency) {
        this.date = date;
        this.currency = currency;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public String getCurrency() {
        return null;
    }
}


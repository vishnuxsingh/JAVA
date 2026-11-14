class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        paymentStatus status = paymentStatus.PENDING;
        System.out.println(status.getCode());
        paymentStatus[] status2 = paymentStatus.values();
        for(paymentStatus s : status2) {
            System.out.println(s.name());
        }
    }
}
//final class paymentStatus extends Enum<paymentStatus>
enum paymentStatus {
    PENDING(189),
    //public static final int PENDING = new paymentStatus(189);
    COMPLETED(190),
    FAILED(191);
    private int code;
    paymentStatus(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}

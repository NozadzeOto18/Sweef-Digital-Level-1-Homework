class PalindromeActivity : AppCompatActivity() {
    private var coin50 =0;
    private var coin20 =0;
    private var coin10 =0;
    private var coin5 =0;
    private var coin1 =0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        minSplit(95)
        //prints max values of each coins
        println("50 - " + coin50 + "20 - " + coin20 + "10 - " + coin10 + "5 - " + coin5 + "1 - "+ coin1)
    }

    private fun minSplit(amount: Int): Int {
        var remain = amount
        coin50 = remain/50 - remain%50
        remain = remain%50
        coin20 = remain/20 - remain%20
        remain = remain%20
        coin10 = remain/10 - remain%10
        remain = remain%10
        coin5 = remain/5 - remain%5
        remain = remain%5
        coin1 = remain/1 - remain%1
        //returns max values of coins
        return (coin50 + coin20 + coin10 + coin5 + coin1)
    }
}

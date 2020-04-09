package com.example.week8.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }


    public static String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"6419.87\",\n" +
            "      \"percent_change_24h\": \"6.62\",\n" +
            "      \"percent_change_1h\": \"-0.63\",\n" +
            "      \"percent_change_7d\": \"2.42\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"117362706974.44\",\n" +
            "      \"volume24\": 28535807426.990524,\n" +
            "      \"volume24a\": 22138261404.11766,\n" +
            "      \"csupply\": \"18281159.00\",\n" +
            "      \"tsupply\": \"18281159\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"131.53\",\n" +
            "      \"percent_change_24h\": \"3.27\",\n" +
            "      \"percent_change_1h\": \"-0.82\",\n" +
            "      \"percent_change_7d\": \"0.97\",\n" +
            "      \"price_btc\": \"0.020456\",\n" +
            "      \"market_cap_usd\": \"14494649847.33\",\n" +
            "      \"volume24\": 9735407274.314394,\n" +
            "      \"volume24a\": 8196208213.471423,\n" +
            "      \"csupply\": \"110196485.00\",\n" +
            "      \"tsupply\": \"110196485\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"0.171888\",\n" +
            "      \"percent_change_24h\": \"2.72\",\n" +
            "      \"percent_change_1h\": \"-0.37\",\n" +
            "      \"percent_change_7d\": \"10.19\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"7375628084.22\",\n" +
            "      \"volume24\": 1586266986.4165068,\n" +
            "      \"volume24a\": 1523628411.6741276,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.45\",\n" +
            "      \"percent_change_1h\": \"0.14\",\n" +
            "      \"percent_change_7d\": \"0.01\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"4063894188.95\",\n" +
            "      \"volume24\": 34554115610.58819,\n" +
            "      \"volume24a\": 26780811557.531475,\n" +
            "      \"csupply\": \"4049107372.00\",\n" +
            "      \"tsupply\": \"4049107372\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"218.72\",\n" +
            "      \"percent_change_24h\": \"3.68\",\n" +
            "      \"percent_change_1h\": \"-0.70\",\n" +
            "      \"percent_change_7d\": \"0.90\",\n" +
            "      \"price_btc\": \"0.034016\",\n" +
            "      \"market_cap_usd\": \"4012211549.64\",\n" +
            "      \"volume24\": 2170970572.6520286,\n" +
            "      \"volume24a\": 1915837368.7595122,\n" +
            "      \"csupply\": \"18343840.00\",\n" +
            "      \"tsupply\": \"18343840\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"165.03\",\n" +
            "      \"percent_change_24h\": \"8.17\",\n" +
            "      \"percent_change_1h\": \"-0.99\",\n" +
            "      \"percent_change_7d\": \"-1.56\",\n" +
            "      \"price_btc\": \"0.025666\",\n" +
            "      \"market_cap_usd\": \"3026857652.79\",\n" +
            "      \"volume24\": 1825200244.2872128,\n" +
            "      \"volume24a\": 1229554179.1056693,\n" +
            "      \"csupply\": \"18341277.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"38.75\",\n" +
            "      \"percent_change_24h\": \"2.77\",\n" +
            "      \"percent_change_1h\": \"-0.22\",\n" +
            "      \"percent_change_7d\": \"1.25\",\n" +
            "      \"price_btc\": \"0.006026\",\n" +
            "      \"market_cap_usd\": \"2503792046.16\",\n" +
            "      \"volume24\": 2870857860.3854837,\n" +
            "      \"volume24a\": 2089290382.1320693,\n" +
            "      \"csupply\": \"64619858.00\",\n" +
            "      \"tsupply\": \"64619858\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"2.21\",\n" +
            "      \"percent_change_24h\": \"3.17\",\n" +
            "      \"percent_change_1h\": \"-0.52\",\n" +
            "      \"percent_change_7d\": \"-1.72\",\n" +
            "      \"price_btc\": \"0.000344\",\n" +
            "      \"market_cap_usd\": \"2056888158.27\",\n" +
            "      \"volume24\": 2254719823.3191614,\n" +
            "      \"volume24a\": 1635900164.5804815,\n" +
            "      \"csupply\": \"929000281.00\",\n" +
            "      \"tsupply\": \"1006245120\",\n" +
            "      \"msupply\": \"1006245120\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"12.24\",\n" +
            "      \"percent_change_24h\": \"4.95\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"3.03\",\n" +
            "      \"price_btc\": \"0.001903\",\n" +
            "      \"market_cap_usd\": \"1903680871.04\",\n" +
            "      \"volume24\": 245625365.55791628,\n" +
            "      \"volume24a\": 177017026.7881912,\n" +
            "      \"csupply\": \"155536713.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"1.58\",\n" +
            "      \"percent_change_24h\": \"3.47\",\n" +
            "      \"percent_change_1h\": \"-1.09\",\n" +
            "      \"percent_change_7d\": \"-2.21\",\n" +
            "      \"price_btc\": \"0.000246\",\n" +
            "      \"market_cap_usd\": \"1043434646.90\",\n" +
            "      \"volume24\": 75734337.39636576,\n" +
            "      \"volume24a\": 60252791.00934928,\n" +
            "      \"csupply\": \"660373612.00\",\n" +
            "      \"tsupply\": \"763306930\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"1.04\",\n" +
            "      \"percent_change_24h\": \"1.79\",\n" +
            "      \"percent_change_1h\": \"-0.30\",\n" +
            "      \"percent_change_7d\": \"1.20\",\n" +
            "      \"price_btc\": \"0.000161\",\n" +
            "      \"market_cap_usd\": \"1036519742.08\",\n" +
            "      \"volume24\": 2312011.278138203,\n" +
            "      \"volume24a\": 1370379.6217389514,\n" +
            "      \"csupply\": \"999498893.00\",\n" +
            "      \"tsupply\": \"999498893\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.040178\",\n" +
            "      \"percent_change_24h\": \"3.59\",\n" +
            "      \"percent_change_1h\": \"-0.53\",\n" +
            "      \"percent_change_7d\": \"3.21\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"814949195.58\",\n" +
            "      \"volume24\": 263820239.19554967,\n" +
            "      \"volume24a\": 231755395.98814163,\n" +
            "      \"csupply\": \"20283516588.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"46.49\",\n" +
            "      \"percent_change_24h\": \"3.58\",\n" +
            "      \"percent_change_1h\": \"0.04\",\n" +
            "      \"percent_change_7d\": \"11.23\",\n" +
            "      \"price_btc\": \"0.007231\",\n" +
            "      \"market_cap_usd\": \"798518857.36\",\n" +
            "      \"volume24\": 116426519.24391443,\n" +
            "      \"volume24a\": 105448185.66031216,\n" +
            "      \"csupply\": \"17174299.00\",\n" +
            "      \"tsupply\": \"17174299\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.029642\",\n" +
            "      \"percent_change_24h\": \"3.76\",\n" +
            "      \"percent_change_1h\": \"-1.01\",\n" +
            "      \"percent_change_7d\": \"2.90\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"768533533.14\",\n" +
            "      \"volume24\": 71625618.84505998,\n" +
            "      \"volume24a\": 62304815.91620174,\n" +
            "      \"csupply\": \"25927070538.00\",\n" +
            "      \"tsupply\": \"31112483745\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"0.011455\",\n" +
            "      \"percent_change_24h\": \"4.52\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"2.73\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"763845349.07\",\n" +
            "      \"volume24\": 782788713.1412299,\n" +
            "      \"volume24a\": 702242756.4658862,\n" +
            "      \"csupply\": \"66682072191.00\",\n" +
            "      \"tsupply\": \"99000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"2.13\",\n" +
            "      \"percent_change_24h\": \"3.41\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"-1.07\",\n" +
            "      \"price_btc\": \"0.000332\",\n" +
            "      \"market_cap_usd\": \"746571337.12\",\n" +
            "      \"volume24\": 183751084.27431065,\n" +
            "      \"volume24a\": 150017478.38500324,\n" +
            "      \"csupply\": \"350000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000 \"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"65.24\",\n" +
            "      \"percent_change_24h\": \"4.53\",\n" +
            "      \"percent_change_1h\": \"-0.86\",\n" +
            "      \"percent_change_7d\": \"-4.30\",\n" +
            "      \"price_btc\": \"0.010146\",\n" +
            "      \"market_cap_usd\": \"612805762.16\",\n" +
            "      \"volume24\": 518447212.454193,\n" +
            "      \"volume24a\": 457998191.8882101,\n" +
            "      \"csupply\": \"9393253.00\",\n" +
            "      \"tsupply\": \"9393253\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.94\",\n" +
            "      \"percent_change_24h\": \"1.55\",\n" +
            "      \"percent_change_1h\": \"-0.39\",\n" +
            "      \"percent_change_7d\": \"0.64\",\n" +
            "      \"price_btc\": \"0.000768\",\n" +
            "      \"market_cap_usd\": \"557864942.36\",\n" +
            "      \"volume24\": 1482386901.8631475,\n" +
            "      \"volume24a\": 1462260111.77329,\n" +
            "      \"csupply\": \"112980348.00\",\n" +
            "      \"tsupply\": \"112980348\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33538\",\n" +
            "      \"symbol\": \"MIN\",\n" +
            "      \"name\": \"MINDOL\",\n" +
            "      \"nameid\": \"mindol\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"3.10\",\n" +
            "      \"percent_change_24h\": \"2.50\",\n" +
            "      \"percent_change_1h\": \"5.28\",\n" +
            "      \"percent_change_7d\": \"5.38\",\n" +
            "      \"price_btc\": \"0.000482\",\n" +
            "      \"market_cap_usd\": \"481603062.87\",\n" +
            "      \"volume24\": 807347.97433263,\n" +
            "      \"volume24a\": 806703.8427525136,\n" +
            "      \"csupply\": \"155379617.00\",\n" +
            "      \"tsupply\": \"240000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33608\",\n" +
            "      \"symbol\": \"HEDG\",\n" +
            "      \"name\": \"HedgeTrade\",\n" +
            "      \"nameid\": \"hedgetrade\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"1.64\",\n" +
            "      \"percent_change_24h\": \"4.07\",\n" +
            "      \"percent_change_1h\": \"-0.47\",\n" +
            "      \"percent_change_7d\": \"3.43\",\n" +
            "      \"price_btc\": \"0.000256\",\n" +
            "      \"market_cap_usd\": \"474376850.36\",\n" +
            "      \"volume24\": 467377.5309393501,\n" +
            "      \"volume24a\": 289936.15016581496,\n" +
            "      \"csupply\": \"288393355.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"6.58\",\n" +
            "      \"percent_change_24h\": \"3.89\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"3.27\",\n" +
            "      \"price_btc\": \"0.001024\",\n" +
            "      \"market_cap_usd\": \"464301522.57\",\n" +
            "      \"volume24\": 393386769.0755913,\n" +
            "      \"volume24a\": 340098313.46582687,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"0.998020\",\n" +
            "      \"percent_change_24h\": \"-0.23\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"-0.02\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"434171035.34\",\n" +
            "      \"volume24\": 230794541.79137915,\n" +
            "      \"volume24a\": 206626815.67832482,\n" +
            "      \"csupply\": \"435032301.00\",\n" +
            "      \"tsupply\": \"435032301\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"0.043857\",\n" +
            "      \"percent_change_24h\": \"4.45\",\n" +
            "      \"percent_change_1h\": \"0.56\",\n" +
            "      \"percent_change_7d\": \"11.64\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"407029597.83\",\n" +
            "      \"volume24\": 4968759.435755509,\n" +
            "      \"volume24a\": 5026387.200405373,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"IOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.141427\",\n" +
            "      \"percent_change_24h\": \"4.67\",\n" +
            "      \"percent_change_1h\": \"-0.26\",\n" +
            "      \"percent_change_7d\": \"3.05\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"393100783.79\",\n" +
            "      \"volume24\": 11194528.70967218,\n" +
            "      \"volume24a\": 9900937.256158948,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"1.95\",\n" +
            "      \"percent_change_24h\": \"2.23\",\n" +
            "      \"percent_change_1h\": \"-0.74\",\n" +
            "      \"percent_change_7d\": \"-5.95\",\n" +
            "      \"price_btc\": \"0.000304\",\n" +
            "      \"market_cap_usd\": \"372615554.18\",\n" +
            "      \"volume24\": 100960172.41425017,\n" +
            "      \"volume24a\": 90034999.18515216,\n" +
            "      \"csupply\": \"190688439.00\",\n" +
            "      \"tsupply\": \"237928231\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"NEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"0.037226\",\n" +
            "      \"percent_change_24h\": \"0.67\",\n" +
            "      \"percent_change_1h\": \"-0.65\",\n" +
            "      \"percent_change_7d\": \"-3.12\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"335038341.34\",\n" +
            "      \"volume24\": 29617708.735497084,\n" +
            "      \"volume24a\": 8573165.483491497,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"296.25\",\n" +
            "      \"percent_change_24h\": \"2.02\",\n" +
            "      \"percent_change_1h\": \"-0.61\",\n" +
            "      \"percent_change_7d\": \"15.14\",\n" +
            "      \"price_btc\": \"0.046074\",\n" +
            "      \"market_cap_usd\": \"296254888.33\",\n" +
            "      \"volume24\": 3816412.965295497,\n" +
            "      \"volume24a\": 4100076.988205148,\n" +
            "      \"csupply\": \"1000000.00\",\n" +
            "      \"tsupply\": \"1000000\",\n" +
            "      \"msupply\": \"1000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"30.59\",\n" +
            "      \"percent_change_24h\": \"5.32\",\n" +
            "      \"percent_change_1h\": \"-0.57\",\n" +
            "      \"percent_change_7d\": \"-3.15\",\n" +
            "      \"price_btc\": \"0.004757\",\n" +
            "      \"market_cap_usd\": \"290501056.99\",\n" +
            "      \"volume24\": 358451396.4605251,\n" +
            "      \"volume24a\": 230284469.3367811,\n" +
            "      \"csupply\": \"9496456.00\",\n" +
            "      \"tsupply\": \"9496456\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33061\",\n" +
            "      \"symbol\": \"INB\",\n" +
            "      \"name\": \"Insight Chain\",\n" +
            "      \"nameid\": \"insight-chain\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"0.760800\",\n" +
            "      \"percent_change_24h\": \"5.74\",\n" +
            "      \"percent_change_1h\": \"0.88\",\n" +
            "      \"percent_change_7d\": \"-0.86\",\n" +
            "      \"price_btc\": \"0.000118\",\n" +
            "      \"market_cap_usd\": \"266205965.79\",\n" +
            "      \"volume24\": 17217899.678507235,\n" +
            "      \"volume24a\": 12322514.916874448,\n" +
            "      \"csupply\": \"349902689.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.001818\",\n" +
            "      \"percent_change_24h\": \"4.83\",\n" +
            "      \"percent_change_1h\": \"-0.92\",\n" +
            "      \"percent_change_7d\": \"1.88\",\n" +
            "      \"price_btc\": \"2.83E-7\",\n" +
            "      \"market_cap_usd\": \"224950442.41\",\n" +
            "      \"volume24\": 125016999.77202074,\n" +
            "      \"volume24a\": 124273320.97781086,\n" +
            "      \"csupply\": \"123727126384.00\",\n" +
            "      \"tsupply\": \"123727126384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32331\",\n" +
            "      \"symbol\": \"ONT\",\n" +
            "      \"name\": \"Ontology\",\n" +
            "      \"nameid\": \"ontology\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.366304\",\n" +
            "      \"percent_change_24h\": \"2.26\",\n" +
            "      \"percent_change_1h\": \"-0.66\",\n" +
            "      \"percent_change_7d\": \"0.28\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"195417032.89\",\n" +
            "      \"volume24\": 42023086.45051669,\n" +
            "      \"volume24a\": 40564353.46495846,\n" +
            "      \"csupply\": \"533483170.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"0.997427\",\n" +
            "      \"percent_change_24h\": \"0.01\",\n" +
            "      \"percent_change_1h\": \"-0.10\",\n" +
            "      \"percent_change_7d\": \"-0.02\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"194980342.48\",\n" +
            "      \"volume24\": 414037329.72623914,\n" +
            "      \"volume24a\": 314928220.94421726,\n" +
            "      \"csupply\": \"195483256.00\",\n" +
            "      \"tsupply\": \"195483256\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33820\",\n" +
            "      \"symbol\": \"PAX\",\n" +
            "      \"name\": \"Paxos Standard Token\",\n" +
            "      \"nameid\": \"paxos-standard-token\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.998025\",\n" +
            "      \"percent_change_24h\": \"0.17\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"0.03\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"193983175.59\",\n" +
            "      \"volume24\": 442586090.85559386,\n" +
            "      \"volume24a\": 620289507.7911832,\n" +
            "      \"csupply\": \"194366961.00\",\n" +
            "      \"tsupply\": \"194366961\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.140096\",\n" +
            "      \"percent_change_24h\": \"4.42\",\n" +
            "      \"percent_change_1h\": \"0.22\",\n" +
            "      \"percent_change_7d\": \"7.85\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"179213752.73\",\n" +
            "      \"volume24\": 59933642.249679744,\n" +
            "      \"volume24a\": 50300514.73171851,\n" +
            "      \"csupply\": \"1279225522.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"3.27\",\n" +
            "      \"percent_change_24h\": \"4.63\",\n" +
            "      \"percent_change_1h\": \"-0.49\",\n" +
            "      \"percent_change_7d\": \"-0.66\",\n" +
            "      \"price_btc\": \"0.000508\",\n" +
            "      \"market_cap_usd\": \"163423386.80\",\n" +
            "      \"volume24\": 119007537.62420578,\n" +
            "      \"volume24a\": 112583542.63642585,\n" +
            "      \"csupply\": \"50000200.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"0.002933\",\n" +
            "      \"percent_change_24h\": \"3.02\",\n" +
            "      \"percent_change_1h\": \"-0.66\",\n" +
            "      \"percent_change_7d\": \"4.68\",\n" +
            "      \"price_btc\": \"4.56E-7\",\n" +
            "      \"market_cap_usd\": \"162662250.25\",\n" +
            "      \"volume24\": 80804459.94495475,\n" +
            "      \"volume24a\": 67027364.489118546,\n" +
            "      \"csupply\": \"55454734800.00\",\n" +
            "      \"tsupply\": \"86712634466\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"11.22\",\n" +
            "      \"percent_change_24h\": \"7.15\",\n" +
            "      \"percent_change_1h\": \"-0.79\",\n" +
            "      \"percent_change_7d\": \"-0.54\",\n" +
            "      \"price_btc\": \"0.001745\",\n" +
            "      \"market_cap_usd\": \"126301029.91\",\n" +
            "      \"volume24\": 66239740.52444812,\n" +
            "      \"volume24a\": 68778767.71251874,\n" +
            "      \"csupply\": \"11255663.00\",\n" +
            "      \"tsupply\": \"11255663\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"7.25\",\n" +
            "      \"percent_change_24h\": \"5.88\",\n" +
            "      \"percent_change_1h\": \"-0.67\",\n" +
            "      \"percent_change_7d\": \"-2.62\",\n" +
            "      \"price_btc\": \"0.001127\",\n" +
            "      \"market_cap_usd\": \"124989522.61\",\n" +
            "      \"volume24\": 17618659.57971617,\n" +
            "      \"volume24a\": 16002889.372031977,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"108\",\n" +
            "      \"symbol\": \"LSK\",\n" +
            "      \"name\": \"Lisk\",\n" +
            "      \"nameid\": \"lisk\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"0.968298\",\n" +
            "      \"percent_change_24h\": \"3.55\",\n" +
            "      \"percent_change_1h\": \"-0.85\",\n" +
            "      \"percent_change_7d\": \"-4.62\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"115821215.88\",\n" +
            "      \"volume24\": 2633843.063708917,\n" +
            "      \"volume24a\": 2505121.7154595642,\n" +
            "      \"csupply\": \"119613215.00\",\n" +
            "      \"tsupply\": \"125643660\",\n" +
            "      \"msupply\": \"159918400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"237\",\n" +
            "      \"symbol\": \"QTUM\",\n" +
            "      \"name\": \"Qtum\",\n" +
            "      \"nameid\": \"qtum\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.20\",\n" +
            "      \"percent_change_24h\": \"1.75\",\n" +
            "      \"percent_change_1h\": \"-0.71\",\n" +
            "      \"percent_change_7d\": \"-1.35\",\n" +
            "      \"price_btc\": \"0.000186\",\n" +
            "      \"market_cap_usd\": \"114720542.82\",\n" +
            "      \"volume24\": 335547819.3291392,\n" +
            "      \"volume24a\": 297618388.5551858,\n" +
            "      \"csupply\": \"95969372.00\",\n" +
            "      \"tsupply\": \"100909224\",\n" +
            "      \"msupply\": \"100909224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"129\",\n" +
            "      \"symbol\": \"REP\",\n" +
            "      \"name\": \"Augur\",\n" +
            "      \"nameid\": \"augur\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"10.38\",\n" +
            "      \"percent_change_24h\": \"6.90\",\n" +
            "      \"percent_change_1h\": \"1.77\",\n" +
            "      \"percent_change_7d\": \"24.58\",\n" +
            "      \"price_btc\": \"0.001615\",\n" +
            "      \"market_cap_usd\": \"114208965.04\",\n" +
            "      \"volume24\": 10470373.369013457,\n" +
            "      \"volume24a\": 10042115.13888299,\n" +
            "      \"csupply\": \"11000000.00\",\n" +
            "      \"tsupply\": \"11000000\",\n" +
            "      \"msupply\": \"11000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3708\",\n" +
            "      \"symbol\": \"ICX\",\n" +
            "      \"name\": \"ICON\",\n" +
            "      \"nameid\": \"icon\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"0.206496\",\n" +
            "      \"percent_change_24h\": \"10.65\",\n" +
            "      \"percent_change_1h\": \"-1.41\",\n" +
            "      \"percent_change_7d\": \"6.03\",\n" +
            "      \"price_btc\": \"0.000032\",\n" +
            "      \"market_cap_usd\": \"101276841.90\",\n" +
            "      \"volume24\": 23547383.997533306,\n" +
            "      \"volume24a\": 12850380.508730145,\n" +
            "      \"csupply\": \"490453303.00\",\n" +
            "      \"tsupply\": \"800460000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33821\",\n" +
            "      \"symbol\": \"ABBC\",\n" +
            "      \"name\": \"ABBC Coin\",\n" +
            "      \"nameid\": \"abbc-coin\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.091178\",\n" +
            "      \"percent_change_24h\": \"3.18\",\n" +
            "      \"percent_change_1h\": \"-0.08\",\n" +
            "      \"percent_change_7d\": \"-3.47\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"91540634.39\",\n" +
            "      \"volume24\": 20278881.71296721,\n" +
            "      \"volume24a\": 15217600.012539761,\n" +
            "      \"csupply\": \"1003981087.00\",\n" +
            "      \"tsupply\": \"1003981087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32073\",\n" +
            "      \"symbol\": \"BCD\",\n" +
            "      \"name\": \"Bitcoin Diamond\",\n" +
            "      \"nameid\": \"bitcoin-diamond\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"0.488081\",\n" +
            "      \"percent_change_24h\": \"9.48\",\n" +
            "      \"percent_change_1h\": \"-1.28\",\n" +
            "      \"percent_change_7d\": \"-0.34\",\n" +
            "      \"price_btc\": \"0.000076\",\n" +
            "      \"market_cap_usd\": \"91023566.62\",\n" +
            "      \"volume24\": 6073211.98591692,\n" +
            "      \"volume24a\": 5254541.51876608,\n" +
            "      \"csupply\": \"186492898.00\",\n" +
            "      \"tsupply\": \"186492898\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2729\",\n" +
            "      \"symbol\": \"ZRX\",\n" +
            "      \"name\": \"0x\",\n" +
            "      \"nameid\": \"0x\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.150941\",\n" +
            "      \"percent_change_24h\": \"2.13\",\n" +
            "      \"percent_change_1h\": \"-0.24\",\n" +
            "      \"percent_change_7d\": \"1.38\",\n" +
            "      \"price_btc\": \"0.000023\",\n" +
            "      \"market_cap_usd\": \"90636424.89\",\n" +
            "      \"volume24\": 11746128.407882072,\n" +
            "      \"volume24a\": 10778952.509230781,\n" +
            "      \"csupply\": \"600475853.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"4.26\",\n" +
            "      \"percent_change_24h\": \"5.73\",\n" +
            "      \"percent_change_1h\": \"-0.28\",\n" +
            "      \"percent_change_7d\": \"1.58\",\n" +
            "      \"price_btc\": \"0.000663\",\n" +
            "      \"market_cap_usd\": \"85275670.69\",\n" +
            "      \"volume24\": 231916842.84685406,\n" +
            "      \"volume24a\": 215279248.9283159,\n" +
            "      \"csupply\": \"20000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"0.958404\",\n" +
            "      \"percent_change_24h\": \"5.79\",\n" +
            "      \"percent_change_1h\": \"0.08\",\n" +
            "      \"percent_change_7d\": \"-15.87\",\n" +
            "      \"price_btc\": \"0.000149\",\n" +
            "      \"market_cap_usd\": \"85054251.73\",\n" +
            "      \"volume24\": 6773652.890214794,\n" +
            "      \"volume24a\": 4195750.19741456,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"180730576\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.828264\",\n" +
            "      \"percent_change_24h\": \"5.19\",\n" +
            "      \"percent_change_1h\": \"-0.45\",\n" +
            "      \"percent_change_7d\": \"-8.59\",\n" +
            "      \"price_btc\": \"0.000129\",\n" +
            "      \"market_cap_usd\": \"82826438.42\",\n" +
            "      \"volume24\": 41451613.124102026,\n" +
            "      \"volume24a\": 35612494.55703636,\n" +
            "      \"csupply\": \"100000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32417\",\n" +
            "      \"symbol\": \"DAI\",\n" +
            "      \"name\": \"Dai\",\n" +
            "      \"nameid\": \"dai\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"1.02\",\n" +
            "      \"percent_change_24h\": \"-0.67\",\n" +
            "      \"percent_change_1h\": \"-0.10\",\n" +
            "      \"percent_change_7d\": \"-1.00\",\n" +
            "      \"price_btc\": \"0.000159\",\n" +
            "      \"market_cap_usd\": \"79862439.04\",\n" +
            "      \"volume24\": 10755124.87414492,\n" +
            "      \"volume24a\": 9225871.234989563,\n" +
            "      \"csupply\": \"78262606.00\",\n" +
            "      \"tsupply\": \"78262606\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"22\",\n" +
            "      \"symbol\": \"MONA\",\n" +
            "      \"name\": \"MonaCoin\",\n" +
            "      \"nameid\": \"monacoin\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"1.20\",\n" +
            "      \"percent_change_24h\": \"4.63\",\n" +
            "      \"percent_change_1h\": \"-0.67\",\n" +
            "      \"percent_change_7d\": \"-2.30\",\n" +
            "      \"price_btc\": \"0.000186\",\n" +
            "      \"market_cap_usd\": \"78556771.99\",\n" +
            "      \"volume24\": 4285754.899408314,\n" +
            "      \"volume24a\": 3326710.8770278348,\n" +
            "      \"csupply\": \"65729675.00\",\n" +
            "      \"tsupply\": \"65729675\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"211\",\n" +
            "      \"symbol\": \"MCO\",\n" +
            "      \"name\": \"Crypto.com\",\n" +
            "      \"nameid\": \"monaco\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"4.79\",\n" +
            "      \"percent_change_24h\": \"8.77\",\n" +
            "      \"percent_change_1h\": \"-0.45\",\n" +
            "      \"percent_change_7d\": \"6.93\",\n" +
            "      \"price_btc\": \"0.000745\",\n" +
            "      \"market_cap_usd\": \"75667830.39\",\n" +
            "      \"volume24\": 23176643.63074434,\n" +
            "      \"volume24a\": 29564688.952529106,\n" +
            "      \"csupply\": \"15793831.00\",\n" +
            "      \"tsupply\": \"31587682\",\n" +
            "      \"msupply\": \"31587682.3632061\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33723\",\n" +
            "      \"symbol\": \"SNX\",\n" +
            "      \"name\": \"Synthetix Network Token\",\n" +
            "      \"nameid\": \"synthetix-network-token\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"0.599012\",\n" +
            "      \"percent_change_24h\": \"6.11\",\n" +
            "      \"percent_change_1h\": \"-0.20\",\n" +
            "      \"percent_change_7d\": \"28.06\",\n" +
            "      \"price_btc\": \"0.000093\",\n" +
            "      \"market_cap_usd\": \"75450906.43\",\n" +
            "      \"volume24\": 1132966.8781739948,\n" +
            "      \"volume24a\": 690977.5656919254,\n" +
            "      \"csupply\": \"125958830.00\",\n" +
            "      \"tsupply\": \"125958830\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2515\",\n" +
            "      \"symbol\": \"KNC\",\n" +
            "      \"name\": \"Kyber Network\",\n" +
            "      \"nameid\": \"kyber-network\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"0.437340\",\n" +
            "      \"percent_change_24h\": \"2.06\",\n" +
            "      \"percent_change_1h\": \"-0.74\",\n" +
            "      \"percent_change_7d\": \"-2.09\",\n" +
            "      \"price_btc\": \"0.000068\",\n" +
            "      \"market_cap_usd\": \"73413964.21\",\n" +
            "      \"volume24\": 38798137.63968774,\n" +
            "      \"volume24a\": 40403401.93121393,\n" +
            "      \"csupply\": \"167864614.00\",\n" +
            "      \"tsupply\": \"215625349\",\n" +
            "      \"msupply\": \"226000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"232\",\n" +
            "      \"symbol\": \"OMG\",\n" +
            "      \"name\": \"OmiseGO\",\n" +
            "      \"nameid\": \"omisego\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"0.511835\",\n" +
            "      \"percent_change_24h\": \"6.23\",\n" +
            "      \"percent_change_1h\": \"-0.48\",\n" +
            "      \"percent_change_7d\": \"0.45\",\n" +
            "      \"price_btc\": \"0.000080\",\n" +
            "      \"market_cap_usd\": \"71782509.93\",\n" +
            "      \"volume24\": 108230096.20787403,\n" +
            "      \"volume24a\": 126059813.98531619,\n" +
            "      \"csupply\": \"140245398.00\",\n" +
            "      \"tsupply\": \"140245398\",\n" +
            "      \"msupply\": \"140245398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.092117\",\n" +
            "      \"percent_change_24h\": \"7.79\",\n" +
            "      \"percent_change_1h\": \"-1.95\",\n" +
            "      \"percent_change_7d\": \"28.30\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"71508785.10\",\n" +
            "      \"volume24\": 7897968.5902600465,\n" +
            "      \"volume24a\": 5522996.984262731,\n" +
            "      \"csupply\": \"776278713.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"207\",\n" +
            "      \"symbol\": \"SNT\",\n" +
            "      \"name\": \"Status Network Token\",\n" +
            "      \"nameid\": \"status\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"0.018268\",\n" +
            "      \"percent_change_24h\": \"-1.22\",\n" +
            "      \"percent_change_1h\": \"0.22\",\n" +
            "      \"percent_change_7d\": \"16.67\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"63399343.30\",\n" +
            "      \"volume24\": 40686375.259400904,\n" +
            "      \"volume24a\": 55084647.062191725,\n" +
            "      \"csupply\": \"3470483788.00\",\n" +
            "      \"tsupply\": \"6804870174\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"0.014737\",\n" +
            "      \"percent_change_24h\": \"4.48\",\n" +
            "      \"percent_change_1h\": \"-0.92\",\n" +
            "      \"percent_change_7d\": \"3.42\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"63021160.27\",\n" +
            "      \"volume24\": 8531418.750158316,\n" +
            "      \"volume24a\": 6599568.54788306,\n" +
            "      \"csupply\": \"4276480000.00\",\n" +
            "      \"tsupply\": \"4276480000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2835\",\n" +
            "      \"symbol\": \"NANO\",\n" +
            "      \"name\": \"Nano\",\n" +
            "      \"nameid\": \"nano\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"0.462748\",\n" +
            "      \"percent_change_24h\": \"3.52\",\n" +
            "      \"percent_change_1h\": \"-0.14\",\n" +
            "      \"percent_change_7d\": \"6.32\",\n" +
            "      \"price_btc\": \"0.000072\",\n" +
            "      \"market_cap_usd\": \"61660373.19\",\n" +
            "      \"volume24\": 2395474.338946482,\n" +
            "      \"volume24a\": 1908055.094688861,\n" +
            "      \"csupply\": \"133248297.00\",\n" +
            "      \"tsupply\": \"133248297\",\n" +
            "      \"msupply\": \"133248297\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.106768\",\n" +
            "      \"percent_change_24h\": \"4.20\",\n" +
            "      \"percent_change_1h\": \"-0.14\",\n" +
            "      \"percent_change_7d\": \"4.00\",\n" +
            "      \"price_btc\": \"0.000017\",\n" +
            "      \"market_cap_usd\": \"59789829.81\",\n" +
            "      \"volume24\": 9748848.066041954,\n" +
            "      \"volume24a\": 9825169.095035717,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33071\",\n" +
            "      \"symbol\": \"DX\",\n" +
            "      \"name\": \"DxChain Token\",\n" +
            "      \"nameid\": \"dxchain-token\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"0.001249\",\n" +
            "      \"percent_change_24h\": \"6.33\",\n" +
            "      \"percent_change_1h\": \"-0.80\",\n" +
            "      \"percent_change_7d\": \"-2.80\",\n" +
            "      \"price_btc\": \"1.94E-7\",\n" +
            "      \"market_cap_usd\": \"57767995.89\",\n" +
            "      \"volume24\": 1410067.518860207,\n" +
            "      \"volume24a\": 1273979.0739135577,\n" +
            "      \"csupply\": \"46250000000.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"43\",\n" +
            "      \"symbol\": \"DGB\",\n" +
            "      \"name\": \"Digibyte\",\n" +
            "      \"nameid\": \"digibyte\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"0.004446\",\n" +
            "      \"percent_change_24h\": \"5.20\",\n" +
            "      \"percent_change_1h\": \"-0.63\",\n" +
            "      \"percent_change_7d\": \"30.35\",\n" +
            "      \"price_btc\": \"6.91E-7\",\n" +
            "      \"market_cap_usd\": \"57575313.80\",\n" +
            "      \"volume24\": 895784.206906475,\n" +
            "      \"volume24a\": 778399.6068294635,\n" +
            "      \"csupply\": \"12950710845.00\",\n" +
            "      \"tsupply\": \"12950710845\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2482\",\n" +
            "      \"symbol\": \"BTM\",\n" +
            "      \"name\": \"Bytom\",\n" +
            "      \"nameid\": \"bytom\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.057206\",\n" +
            "      \"percent_change_24h\": \"-0.79\",\n" +
            "      \"percent_change_1h\": \"-0.25\",\n" +
            "      \"percent_change_7d\": \"5.13\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"57349274.48\",\n" +
            "      \"volume24\": 152314619.72583053,\n" +
            "      \"volume24a\": 113321540.15608521,\n" +
            "      \"csupply\": \"1002499275.00\",\n" +
            "      \"tsupply\": \"1407000000\",\n" +
            "      \"msupply\": \"1407000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"183\",\n" +
            "      \"symbol\": \"SC\",\n" +
            "      \"name\": \"Siacoin\",\n" +
            "      \"nameid\": \"siacoin\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.001253\",\n" +
            "      \"percent_change_24h\": \"2.73\",\n" +
            "      \"percent_change_1h\": \"-0.29\",\n" +
            "      \"percent_change_7d\": \"-3.21\",\n" +
            "      \"price_btc\": \"1.95E-7\",\n" +
            "      \"market_cap_usd\": \"52379773.62\",\n" +
            "      \"volume24\": 2373052.724470647,\n" +
            "      \"volume24a\": 2575952.2881960203,\n" +
            "      \"csupply\": \"41817047634.00\",\n" +
            "      \"tsupply\": \"41817047634\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"0.072546\",\n" +
            "      \"percent_change_24h\": \"7.99\",\n" +
            "      \"percent_change_1h\": \"-0.41\",\n" +
            "      \"percent_change_7d\": \"6.71\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"51254048.44\",\n" +
            "      \"volume24\": 2018256.5723939538,\n" +
            "      \"volume24a\": 1640545.0822832352,\n" +
            "      \"csupply\": \"706502689.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"111\",\n" +
            "      \"symbol\": \"DGD\",\n" +
            "      \"name\": \"DigixDAO\",\n" +
            "      \"nameid\": \"digixdao\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"25.41\",\n" +
            "      \"percent_change_24h\": \"4.55\",\n" +
            "      \"percent_change_1h\": \"-0.85\",\n" +
            "      \"percent_change_7d\": \"2.68\",\n" +
            "      \"price_btc\": \"0.003952\",\n" +
            "      \"market_cap_usd\": \"50826235.83\",\n" +
            "      \"volume24\": 945336.559826642,\n" +
            "      \"volume24a\": 874495.9659161574,\n" +
            "      \"csupply\": \"2000000.00\",\n" +
            "      \"tsupply\": \"2000000\",\n" +
            "      \"msupply\": \"2000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"106\",\n" +
            "      \"symbol\": \"STEEM\",\n" +
            "      \"name\": \"STEEM\",\n" +
            "      \"nameid\": \"steem\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"0.140798\",\n" +
            "      \"percent_change_24h\": \"-4.79\",\n" +
            "      \"percent_change_1h\": \"-0.43\",\n" +
            "      \"percent_change_7d\": \"-14.62\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"48203004.82\",\n" +
            "      \"volume24\": 1520433.2132593894,\n" +
            "      \"volume24a\": 1580252.844959746,\n" +
            "      \"csupply\": \"342356149.00\",\n" +
            "      \"tsupply\": \"342356149\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTT\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"0.000219\",\n" +
            "      \"percent_change_24h\": \"3.53\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"1.33\",\n" +
            "      \"price_btc\": \"3.40E-8\",\n" +
            "      \"market_cap_usd\": \"46429656.69\",\n" +
            "      \"volume24\": 4317333.4417416435,\n" +
            "      \"volume24a\": 3715152.2079683575,\n" +
            "      \"csupply\": \"212116500000.00\",\n" +
            "      \"tsupply\": \"990000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"3.81\",\n" +
            "      \"percent_change_24h\": \"13.70\",\n" +
            "      \"percent_change_1h\": \"-0.78\",\n" +
            "      \"percent_change_7d\": \"66.00\",\n" +
            "      \"price_btc\": \"0.000592\",\n" +
            "      \"market_cap_usd\": \"45989201.09\",\n" +
            "      \"volume24\": 3154793.184844311,\n" +
            "      \"volume24a\": 2847318.0177725414,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"45467000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"54\",\n" +
            "      \"symbol\": \"BTS\",\n" +
            "      \"name\": \"BitShares\",\n" +
            "      \"nameid\": \"bitshares\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"0.016121\",\n" +
            "      \"percent_change_24h\": \"3.62\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"-3.70\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"44186471.30\",\n" +
            "      \"volume24\": 3002443.4781543254,\n" +
            "      \"volume24a\": 5421735.446499487,\n" +
            "      \"csupply\": \"2740910000.00\",\n" +
            "      \"tsupply\": \"2740910000\",\n" +
            "      \"msupply\": \"3600570502\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.000331\",\n" +
            "      \"percent_change_24h\": \"4.64\",\n" +
            "      \"percent_change_1h\": \"0.29\",\n" +
            "      \"percent_change_7d\": \"3.78\",\n" +
            "      \"price_btc\": \"5.15E-8\",\n" +
            "      \"market_cap_usd\": \"44111774.14\",\n" +
            "      \"volume24\": 3086822.916591287,\n" +
            "      \"volume24a\": 3006711.792978115,\n" +
            "      \"csupply\": \"133214575156.00\",\n" +
            "      \"tsupply\": \"177619433541\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33228\",\n" +
            "      \"symbol\": \"HC\",\n" +
            "      \"name\": \"HyperCash\",\n" +
            "      \"nameid\": \"hypercash\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"0.972052\",\n" +
            "      \"percent_change_24h\": \"5.34\",\n" +
            "      \"percent_change_1h\": \"-0.71\",\n" +
            "      \"percent_change_7d\": \"-0.70\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"42313217.57\",\n" +
            "      \"volume24\": 728160.9473089852,\n" +
            "      \"volume24a\": 483034.78840971284,\n" +
            "      \"csupply\": \"43529781.00\",\n" +
            "      \"tsupply\": \"43529781\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"186\",\n" +
            "      \"symbol\": \"ZEN\",\n" +
            "      \"name\": \"Horizen\",\n" +
            "      \"nameid\": \"zencash\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"5.71\",\n" +
            "      \"percent_change_24h\": \"2.81\",\n" +
            "      \"percent_change_1h\": \"-0.53\",\n" +
            "      \"percent_change_7d\": \"7.87\",\n" +
            "      \"price_btc\": \"0.000888\",\n" +
            "      \"market_cap_usd\": \"41043295.63\",\n" +
            "      \"volume24\": 1576993.8601327685,\n" +
            "      \"volume24a\": 1801993.8493472943,\n" +
            "      \"csupply\": \"7185725.00\",\n" +
            "      \"tsupply\": \"7185725\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"139\",\n" +
            "      \"symbol\": \"KMD\",\n" +
            "      \"name\": \"Komodo\",\n" +
            "      \"nameid\": \"komodo\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"0.353220\",\n" +
            "      \"percent_change_24h\": \"3.15\",\n" +
            "      \"percent_change_1h\": \"-1.41\",\n" +
            "      \"percent_change_7d\": \"-1.93\",\n" +
            "      \"price_btc\": \"0.000055\",\n" +
            "      \"market_cap_usd\": \"40847216.80\",\n" +
            "      \"volume24\": 1478822.3721672844,\n" +
            "      \"volume24a\": 1811727.3255235394,\n" +
            "      \"csupply\": \"115642437.00\",\n" +
            "      \"tsupply\": \"115642437\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"0.154329\",\n" +
            "      \"percent_change_24h\": \"4.26\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"-2.05\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"40010834.80\",\n" +
            "      \"volume24\": 37483471.57381215,\n" +
            "      \"volume24a\": 33275998.536298208,\n" +
            "      \"csupply\": \"259256762.00\",\n" +
            "      \"tsupply\": \"2588969743\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"102\",\n" +
            "      \"symbol\": \"XVG\",\n" +
            "      \"name\": \"Verge\",\n" +
            "      \"nameid\": \"verge\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.002469\",\n" +
            "      \"percent_change_24h\": \"1.76\",\n" +
            "      \"percent_change_1h\": \"-0.44\",\n" +
            "      \"percent_change_7d\": \"0.34\",\n" +
            "      \"price_btc\": \"3.84E-7\",\n" +
            "      \"market_cap_usd\": \"39254588.71\",\n" +
            "      \"volume24\": 1142064.4242925528,\n" +
            "      \"volume24a\": 1355256.6497588956,\n" +
            "      \"csupply\": \"15900663549.00\",\n" +
            "      \"tsupply\": \"15900663549\",\n" +
            "      \"msupply\": \"16555000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33535\",\n" +
            "      \"symbol\": \"VSYS\",\n" +
            "      \"name\": \"V Systems\",\n" +
            "      \"nameid\": \"v-systems\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"0.021808\",\n" +
            "      \"percent_change_24h\": \"3.78\",\n" +
            "      \"percent_change_1h\": \"-0.92\",\n" +
            "      \"percent_change_7d\": \"-9.87\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"39009950.48\",\n" +
            "      \"volume24\": 4230438.217352057,\n" +
            "      \"volume24a\": 3741242.4208671255,\n" +
            "      \"csupply\": \"1788818695.00\",\n" +
            "      \"tsupply\": \"5217805440\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33529\",\n" +
            "      \"symbol\": \"ZB\",\n" +
            "      \"name\": \"ZB\",\n" +
            "      \"nameid\": \"zb\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"0.223550\",\n" +
            "      \"percent_change_24h\": \"0.74\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"-1.85\",\n" +
            "      \"price_btc\": \"0.000035\",\n" +
            "      \"market_cap_usd\": \"36483166.82\",\n" +
            "      \"volume24\": 33509728.061934695,\n" +
            "      \"volume24a\": 33541429.80267867,\n" +
            "      \"csupply\": \"163198810.00\",\n" +
            "      \"tsupply\": \"2100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32229\",\n" +
            "      \"symbol\": \"IOST\",\n" +
            "      \"name\": \"IOStoken\",\n" +
            "      \"nameid\": \"iostoken\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"0.002969\",\n" +
            "      \"percent_change_24h\": \"3.36\",\n" +
            "      \"percent_change_1h\": \"-0.83\",\n" +
            "      \"percent_change_7d\": \"-6.29\",\n" +
            "      \"price_btc\": \"4.62E-7\",\n" +
            "      \"market_cap_usd\": \"35672197.04\",\n" +
            "      \"volume24\": 22218076.684101187,\n" +
            "      \"volume24a\": 20164606.595686667,\n" +
            "      \"csupply\": \"12013965609.00\",\n" +
            "      \"tsupply\": \"21000000000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32764\",\n" +
            "      \"symbol\": \"SEELE\",\n" +
            "      \"name\": \"Seele\",\n" +
            "      \"nameid\": \"seele\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.048470\",\n" +
            "      \"percent_change_24h\": \"2.81\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"-0.76\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"33579082.61\",\n" +
            "      \"volume24\": 11378285.16224421,\n" +
            "      \"volume24a\": 13486136.863329364,\n" +
            "      \"csupply\": \"692776387.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"131\",\n" +
            "      \"symbol\": \"ARDR\",\n" +
            "      \"name\": \"Ardor\",\n" +
            "      \"nameid\": \"ardor\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.032830\",\n" +
            "      \"percent_change_24h\": \"8.20\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"-0.75\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32796771.20\",\n" +
            "      \"volume24\": 575495.1041148257,\n" +
            "      \"volume24a\": 548740.4428528548,\n" +
            "      \"csupply\": \"998999495.00\",\n" +
            "      \"tsupply\": \"998999495\",\n" +
            "      \"msupply\": \"998999495\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"0.003757\",\n" +
            "      \"percent_change_24h\": \"4.85\",\n" +
            "      \"percent_change_1h\": \"-1.58\",\n" +
            "      \"percent_change_7d\": \"-0.57\",\n" +
            "      \"price_btc\": \"5.84E-7\",\n" +
            "      \"market_cap_usd\": \"32638948.46\",\n" +
            "      \"volume24\": 6585299.585740206,\n" +
            "      \"volume24a\": 5857102.982761172,\n" +
            "      \"csupply\": \"8687360058.00\",\n" +
            "      \"tsupply\": \"12600000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"156\",\n" +
            "      \"symbol\": \"GNT\",\n" +
            "      \"name\": \"Golem\",\n" +
            "      \"nameid\": \"golem-network-tokens\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.033714\",\n" +
            "      \"percent_change_24h\": \"5.89\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"-0.74\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32515722.12\",\n" +
            "      \"volume24\": 2366468.3579243645,\n" +
            "      \"volume24a\": 1750761.3132470546,\n" +
            "      \"csupply\": \"964450000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2765\",\n" +
            "      \"symbol\": \"DATA\",\n" +
            "      \"name\": \"Streamr DATAcoin\",\n" +
            "      \"nameid\": \"streamr-datacoin\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.046979\",\n" +
            "      \"percent_change_24h\": \"18.35\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"81.91\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"31812086.39\",\n" +
            "      \"volume24\": 6274267.302073682,\n" +
            "      \"volume24a\": 2017789.2645503336,\n" +
            "      \"csupply\": \"677154514.00\",\n" +
            "      \"tsupply\": \"987154514\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32226\",\n" +
            "      \"symbol\": \"ELF\",\n" +
            "      \"name\": \"aelf\",\n" +
            "      \"nameid\": \"aelf\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"0.061397\",\n" +
            "      \"percent_change_24h\": \"13.93\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"10.18\",\n" +
            "      \"price_btc\": \"0.000010\",\n" +
            "      \"market_cap_usd\": \"30684866.71\",\n" +
            "      \"volume24\": 41373798.51592953,\n" +
            "      \"volume24a\": 23829980.8712308,\n" +
            "      \"csupply\": \"499780000.00\",\n" +
            "      \"tsupply\": \"499780000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33548\",\n" +
            "      \"symbol\": \"NEX\",\n" +
            "      \"name\": \"Nash Exchange\",\n" +
            "      \"nameid\": \"nash-exchange\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.775662\",\n" +
            "      \"percent_change_24h\": \"21.02\",\n" +
            "      \"percent_change_1h\": \"-0.95\",\n" +
            "      \"percent_change_7d\": \"15.49\",\n" +
            "      \"price_btc\": \"0.000121\",\n" +
            "      \"market_cap_usd\": \"28076369.82\",\n" +
            "      \"volume24\": 3429847.2110689175,\n" +
            "      \"volume24a\": 4176191.6374964067,\n" +
            "      \"csupply\": \"36196678.00\",\n" +
            "      \"tsupply\": \"56296100\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32238\",\n" +
            "      \"symbol\": \"WAX\",\n" +
            "      \"name\": \"WAX\",\n" +
            "      \"nameid\": \"wax\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.029449\",\n" +
            "      \"percent_change_24h\": \"2.40\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"-5.77\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"27765509.62\",\n" +
            "      \"volume24\": 99594.99043232648,\n" +
            "      \"volume24a\": 99551.51542612919,\n" +
            "      \"csupply\": \"942821662.00\",\n" +
            "      \"tsupply\": \"1850000000\",\n" +
            "      \"msupply\": \"1850000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2732\",\n" +
            "      \"symbol\": \"GXS\",\n" +
            "      \"name\": \"GXChain\",\n" +
            "      \"nameid\": \"gxchain\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"0.420756\",\n" +
            "      \"percent_change_24h\": \"4.65\",\n" +
            "      \"percent_change_1h\": \"0.39\",\n" +
            "      \"percent_change_7d\": \"34.21\",\n" +
            "      \"price_btc\": \"0.000065\",\n" +
            "      \"market_cap_usd\": \"27349161.50\",\n" +
            "      \"volume24\": 306664.6935648455,\n" +
            "      \"volume24a\": 481505.4192397323,\n" +
            "      \"csupply\": \"65000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2731\",\n" +
            "      \"symbol\": \"AE\",\n" +
            "      \"name\": \"Aeternity\",\n" +
            "      \"nameid\": \"aeternity\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.097469\",\n" +
            "      \"percent_change_24h\": \"6.54\",\n" +
            "      \"percent_change_1h\": \"0.27\",\n" +
            "      \"percent_change_7d\": \"0.99\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"27323794.86\",\n" +
            "      \"volume24\": 8828096.118094787,\n" +
            "      \"volume24a\": 6521625.09218432,\n" +
            "      \"csupply\": \"280333087.00\",\n" +
            "      \"tsupply\": \"280333087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"0.025146\",\n" +
            "      \"percent_change_24h\": \"9.16\",\n" +
            "      \"percent_change_1h\": \"-0.83\",\n" +
            "      \"percent_change_7d\": \"3.91\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"26406850.81\",\n" +
            "      \"volume24\": 21104708.69125077,\n" +
            "      \"volume24a\": 16936831.948431537,\n" +
            "      \"csupply\": \"1050141509.00\",\n" +
            "      \"tsupply\": \"2644403343\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32342\",\n" +
            "      \"symbol\": \"NPXS\",\n" +
            "      \"name\": \"Pundi X\",\n" +
            "      \"nameid\": \"pundi-x\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"0.000111\",\n" +
            "      \"percent_change_24h\": \"4.00\",\n" +
            "      \"percent_change_1h\": \"-0.52\",\n" +
            "      \"percent_change_7d\": \"3.77\",\n" +
            "      \"price_btc\": \"1.72E-8\",\n" +
            "      \"market_cap_usd\": \"26079287.01\",\n" +
            "      \"volume24\": 710128.2409401365,\n" +
            "      \"volume24a\": 701800.650065621,\n" +
            "      \"csupply\": \"235171468515.00\",\n" +
            "      \"tsupply\": \"280255193861\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32338\",\n" +
            "      \"symbol\": \"WICC\",\n" +
            "      \"name\": \"WaykiChain\",\n" +
            "      \"nameid\": \"waykichain\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.137260\",\n" +
            "      \"percent_change_24h\": \"4.63\",\n" +
            "      \"percent_change_1h\": \"-0.68\",\n" +
            "      \"percent_change_7d\": \"-7.91\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"25942072.28\",\n" +
            "      \"volume24\": 688147.8873911296,\n" +
            "      \"volume24a\": 790613.9441245135,\n" +
            "      \"csupply\": \"189000000.00\",\n" +
            "      \"tsupply\": \"210000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32390\",\n" +
            "      \"symbol\": \"REN\",\n" +
            "      \"name\": \"Republic Protocol\",\n" +
            "      \"nameid\": \"republic-protocol\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.043732\",\n" +
            "      \"percent_change_24h\": \"10.23\",\n" +
            "      \"percent_change_1h\": \"-1.06\",\n" +
            "      \"percent_change_7d\": \"12.96\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"25725645.13\",\n" +
            "      \"volume24\": 760054.5537248224,\n" +
            "      \"volume24a\": 594001.828587187,\n" +
            "      \"csupply\": \"588261205.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"36419\",\n" +
            "      \"symbol\": \"CVCC\",\n" +
            "      \"name\": \"CryptoVerificationCoin\",\n" +
            "      \"nameid\": \"cryptoverificationcoin\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"21.88\",\n" +
            "      \"percent_change_24h\": \"14.71\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"1.58\",\n" +
            "      \"price_btc\": \"0.003402\",\n" +
            "      \"market_cap_usd\": \"25218078.71\",\n" +
            "      \"volume24\": 52259.67104066341,\n" +
            "      \"volume24a\": 0,\n" +
            "      \"csupply\": \"1152727.00\",\n" +
            "      \"tsupply\": \"1152727\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"120\",\n" +
            "      \"symbol\": \"STRAT\",\n" +
            "      \"name\": \"Stratis\",\n" +
            "      \"nameid\": \"stratis\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.239372\",\n" +
            "      \"percent_change_24h\": \"6.01\",\n" +
            "      \"percent_change_1h\": \"-0.17\",\n" +
            "      \"percent_change_7d\": \"1.97\",\n" +
            "      \"price_btc\": \"0.000037\",\n" +
            "      \"market_cap_usd\": \"23872328.01\",\n" +
            "      \"volume24\": 328393.3776125129,\n" +
            "      \"volume24a\": 383277.06127714965,\n" +
            "      \"csupply\": \"99729045.00\",\n" +
            "      \"tsupply\": \"99729045\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"166\",\n" +
            "      \"symbol\": \"RLC\",\n" +
            "      \"name\": \"iExec RLC\",\n" +
            "      \"nameid\": \"rlc\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"0.296460\",\n" +
            "      \"percent_change_24h\": \"9.75\",\n" +
            "      \"percent_change_1h\": \"-0.82\",\n" +
            "      \"percent_change_7d\": \"9.82\",\n" +
            "      \"price_btc\": \"0.000046\",\n" +
            "      \"market_cap_usd\": \"23737757.85\",\n" +
            "      \"volume24\": 411928.31391307776,\n" +
            "      \"volume24a\": 239127.85826721627,\n" +
            "      \"csupply\": \"80070793.00\",\n" +
            "      \"tsupply\": \"86999785\",\n" +
            "      \"msupply\": \" 87000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"264\",\n" +
            "      \"symbol\": \"RCN\",\n" +
            "      \"name\": \"Ripio Credit Network\",\n" +
            "      \"nameid\": \"ripiocreditnetwork\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"0.048097\",\n" +
            "      \"percent_change_24h\": \"-1.11\",\n" +
            "      \"percent_change_1h\": \"-1.35\",\n" +
            "      \"percent_change_7d\": \"20.02\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"23727718.10\",\n" +
            "      \"volume24\": 361694.254748365,\n" +
            "      \"volume24a\": 322809.0356029342,\n" +
            "      \"csupply\": \"493330791.00\",\n" +
            "      \"tsupply\": \"999942647\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.026291\",\n" +
            "      \"percent_change_24h\": \"3.54\",\n" +
            "      \"percent_change_1h\": \"-0.88\",\n" +
            "      \"percent_change_7d\": \"-3.37\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"23617534.02\",\n" +
            "      \"volume24\": 2185565.591512522,\n" +
            "      \"volume24a\": 2166211.066603202,\n" +
            "      \"csupply\": \"898304697.00\",\n" +
            "      \"tsupply\": \"1374956262\",\n" +
            "      \"msupply\": \"1395076055\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33536\",\n" +
            "      \"symbol\": \"MATIC\",\n" +
            "      \"name\": \"Matic Network\",\n" +
            "      \"nameid\": \"matic-network\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.010774\",\n" +
            "      \"percent_change_24h\": \"3.48\",\n" +
            "      \"percent_change_1h\": \"-0.34\",\n" +
            "      \"percent_change_7d\": \"-1.60\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"23434516.96\",\n" +
            "      \"volume24\": 8490041.850647695,\n" +
            "      \"volume24a\": 7392662.564678361,\n" +
            "      \"csupply\": \"2175190262.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"95\",\n" +
            "      \"symbol\": \"MAID\",\n" +
            "      \"name\": \"MaidSafeCoin\",\n" +
            "      \"nameid\": \"maidsafecoin\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.051743\",\n" +
            "      \"percent_change_24h\": \"-4.22\",\n" +
            "      \"percent_change_1h\": \"-0.46\",\n" +
            "      \"percent_change_7d\": \"-5.34\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23416557.41\",\n" +
            "      \"volume24\": 152244.7671104119,\n" +
            "      \"volume24a\": 147592.52120920978,\n" +
            "      \"csupply\": \"452552412.00\",\n" +
            "      \"tsupply\": \"452552412\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33764\",\n" +
            "      \"symbol\": \"RIF\",\n" +
            "      \"name\": \"RIF Token\",\n" +
            "      \"nameid\": \"rif-token\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"0.048925\",\n" +
            "      \"percent_change_24h\": \"7.67\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"6.58\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23385314.85\",\n" +
            "      \"volume24\": 9997053.778955687,\n" +
            "      \"volume24a\": 8240672.247452747,\n" +
            "      \"csupply\": \"477980957.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 3982,\n" +
            "    \"time\": 1585629653\n" +
            "  }\n" +
            "}";


}
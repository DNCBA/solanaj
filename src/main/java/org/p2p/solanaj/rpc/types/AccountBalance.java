package org.p2p.solanaj.rpc.types;

import com.squareup.moshi.Json;


public class AccountBalance extends RpcResultObject {

    public static class Value {
        @Json(name = "amount")
        private String amount;

        @Json(name = "decimals")
        private Integer decimals;

        @Json(name = "uiAmount")
        private double uiAmount;

        @Json(name = "uiAmountString")
        private String uiAmountString;

        public String getAmount() {
            return amount;
        }

        public Integer getDecimals() {
            return decimals;
        }

        public double getUiAmount() {
            return uiAmount;
        }

        public String getUiAmountString() {
            return uiAmountString;
        }
    }

    @Json(name = "value")
    private Value value;

    public Value getValue() {
        return value;
    }

}

package proxywithtemplesample.view.card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import proxywithtemplesample.R;
import proxywithtemplesample.model.Constant;

/**
 * Created by cs on 2016/7/3.
 */
public class SampleCard1 implements CardProxy.ICardProxyPresenter{


    private final Context mContext;
    public SampleCard1(Context context) {
        mContext = context;
    }

    @Override
    public boolean isNeedShow() {
        return true;
    }

    @Override
    public Constant.CardContract.CardType getCardType() {
        return Constant.CardContract.CardType.SMALL_CARD;
    }

    @Override
    public void resumeCallBack() {

    }

    @Override
    public void pauseCallBack() {

    }

    @Override
    public void destroyCallBack() {

    }

    @Override
    public void report4firstTimeShowInAP() {

    }

    @Override
    public Constant.CardContract.CardId getCardId() {
        return Constant.CardContract.CardId.Card1;
    }

    @Override
    public int getResourceId() {
        return R.layout.card1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(LayoutInflater mLayoutInflater, ViewGroup parent) {
        return new CardViewHolder(mContext, mLayoutInflater.inflate(getResourceId(), parent, false));
    }

    @Override
    public void onBindViewHolder() {

    }

    @Override
    public void onClick() {

    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        CardViewHolder(Context ctx, View view) {
            super(view);
        }
    }
}

package fablabtaipei.dalamp;

import android.util.Log;

/**
 * Created by kevinphy on 2016/6/26.
 */

public class MotionControl{
    int x;
    int y;

    public Position onDxDy(Position mPosition, Position center) {
        Position dxdy = new Position();

        dxdy.x = mPosition.x - center.x;
        dxdy.y = mPosition.y - center.y;

        Log.d("SENDING", String.valueOf(mPosition.x));
        Log.d("SENDING", String.valueOf(mPosition.y));
        return mPosition;
    }

}
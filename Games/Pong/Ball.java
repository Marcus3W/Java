package Pong;

public class Ball {

    public Rect rect;
    public Rect leftPaddle, rightPaddle;

    private double vy = -1.0;
    private double vx = -1.0;
    // velocity x, y

    public Ball(Rect rect, Rect leftPaddle, Rect rightPaddle) {
        this.rect = rect;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
    }

    public void update(double dt) {

        if (vy >= 0.0) {
            if (this.rect.y + (vy * Constants.BALL_SPEED * dt) + this.rect.height > Constants.SCREEN_HEIGHT - Constants.INSETS_BOTTOM) {
                vy *= -1.0;
            }
        } else if (vy < 0.0) {
            if (this.rect.y +(vy * Constants.BALL_SPEED * dt) < Constants.TOOLBAR_HEIGHT) {
                vy *= -1.0;
            }
        }

        if (vx < 0.0) {
            if (this.rect.x + (vx * Constants.BALL_SPEED * dt) + leftPaddle.x > leftPaddle.width) {
                if (this.rect.y + (vy * Constants.BALL_SPEED * dt) > leftPaddle.y &&
                        this.rect.y + (vy * Constants.BALL_SPEED * dt) + this.rect.height < leftPaddle.y + leftPaddle.height) {
                    vx *= -1.0;
                }

            } else if (vx >= 0) {
                if (this.rect.x + (vx * Constants.BALL_SPEED * dt) + rect.width > rightPaddle.x) {
                    if (this.rect.y + (vy * Constants.BALL_SPEED * dt) > rightPaddle.y &&
                            this.rect.y + (vy * Constants.BALL_SPEED * dt) + this.rect.height < rightPaddle.y + rightPaddle.height) {
                        vx *= -1.0;
                    }
                }
            }
        }

        this.rect.x += vx * Constants.BALL_SPEED * dt;
        this.rect.y += vy * Constants.BALL_SPEED * dt;
    }

}

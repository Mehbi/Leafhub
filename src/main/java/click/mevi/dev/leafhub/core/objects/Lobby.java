package click.mevi.dev.leafhub.core.objects;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Lobby {
    private double spawnX;
    private double spawnY;
    private double spawnZ;
}

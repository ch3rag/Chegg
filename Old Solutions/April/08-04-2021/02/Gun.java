public class Gun {
	private int effectiveRange;
	private final Clip clip;
	
	Gun(int effectiveRange, Clip clip) {

		if (effectiveRange < 1) {
			effectiveRange = 1;
		}

		this.effectiveRange = effectiveRange;
		this.clip = clip;
	}

	public boolean fire(int targetRange) {
		// Fire only if the target is within effective range and there is a bullet in the clip
		if (targetRange <= effectiveRange && clip.fire()) {
			return true;
		}
		return false;
	}

	public int getEffectiveRange() {
		return this.effectiveRange;
	}

	public void setEffectiveRange(int effectiveRange) {
		if (effectiveRange < 1) {
			effectiveRange = 1;
		}
		this.effectiveRange = effectiveRange;
	}

	public Clip getClip() {
		return this.clip;
	}
}
package yaksha;

public class BoyerMoore {
	private String text;
	private String pattern;

	public BoyerMoore(String text, String pattern) {
		super();
		this.text = text;
		this.pattern = pattern;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}

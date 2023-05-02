package nested.interface_01;

public class Button {
	OnClickListener Listener;
	
	void setOnClickListener(OnClickListener Listener) {
		this.Listener = Listener;
	}
	
	void touch() {
		Listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}

import tkinter as tk


class _TestWindow(tk.Toplevel):
	def __init__(self, master, title):
		super().__init__(master)

		self.configure(borderwidth=5)
		self.geometry("400x200+30+30")
		self.resizable(height=tk.FALSE, width=tk.FALSE)
		self.protocol("WM_DELETE_WINDOW", self.ok)
		self.title(title)

		frame_main = tk.Frame(self)
		frame_main.pack(side=tk.TOP, expand=tk.TRUE, fill=tk.BOTH)
		tk.Label(
			frame_main,
			text="Your layout should appear in the frame below",
		).pack()

		self.frame_problem = tk.Frame(
			frame_main,
			borderwidth=2,
			relief=tk.SUNKEN,
			bg="#ffffaa",
		)
		self.frame_problem.pack(fill=tk.BOTH, expand=tk.TRUE)

		frame_buttons = tk.Frame(self)
		frame_buttons.pack(fill=tk.X)

		self.btn_ok = tk.Button(
			frame_buttons,
			text='Close',
			command=self.ok,
		)
		self.btn_ok.pack()

		self.btn_ok.focus_set()
		self.bind('<Return>', self.ok)
		self.bind('<Escape>', self.ok)

	def ok(self, event=None):
		self.destroy()


def _get_window():
	tw = _TestWindow(None, 'Layout')  # no master: root window
	return tw, tw.frame_problem


def pressed():
	print("Button Pressed!")


def create_layout(frame):
	# Create A New Frame, Set Parent = Frame, And Background = Red
	additionalFrame = tk.Frame(frame, bg='red')

	# Pack To The Left Side, Fill Both Directions And Expand Based On Re-Size
	additionalFrame.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)

	# Button 1
	button1 = tk.Button(additionalFrame, text='Button1', command=pressed)
	# Place It On The Top Of Left Frame
	button1.pack(side=tk.TOP, pady=20, expand=True)

	# Button 2
	button2 = tk.Button(additionalFrame, text='Button2', command=pressed)
	# Place It On The Top Of Left Frame
	button2.pack(side=tk.TOP, pady=20, expand=True)

	# Button 3
	button3 = tk.Button(frame, text='Button3', command=pressed)
	# Place It On The Left Of Main Frame
	button3.pack(side=tk.LEFT, padx=20, expand=True)

	# Button 4
	button4 = tk.Button(frame, text='Button4', command=pressed)
	# Place It On The Left Main Frame
	button4.pack(side=tk.LEFT, padx=20, expand=True)


def _show_student_code():
	window, frame = _get_window()
	create_layout(frame)
	window.mainloop()


_show_student_code()

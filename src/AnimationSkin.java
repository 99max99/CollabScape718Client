public class AnimationSkin {

	public boolean[] flowControl;

	public void decode(RsByteBuffer buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (0 == opcode) {
				break;
			}
			decode(buffer, opcode);
		}
	}

	private void decode(RsByteBuffer buffer, int opcode) {
		if (opcode == 2) {
			flowControl = new boolean[400];
			int count = buffer.readUnsignedSmart(0);
			for (int index = 0; index < count; index++)
				flowControl[buffer.readUnsignedSmart(0)] = true;
		} else if (3 == opcode) {
			buffer.readUnsignedByte();
			int count = buffer.readUnsignedSmart(0);

			for (int index = 0; index < count; index++) {
				buffer.readUnsignedSmart(0);
				buffer.readUnsignedByte();
			}
		}
	}
}

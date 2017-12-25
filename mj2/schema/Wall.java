// automatically generated by the FlatBuffers compiler, do not modify

package mj2.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Wall extends Table {
  public static Wall getRootAsWall(ByteBuffer _bb) { return getRootAsWall(_bb, new Wall()); }
  public static Wall getRootAsWall(ByteBuffer _bb, Wall obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Wall __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int movieId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int movieLength() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public SimulComments simulCommentsArray(int j) { return simulCommentsArray(new SimulComments(), j); }
  public SimulComments simulCommentsArray(SimulComments obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int simulCommentsArrayLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createWall(FlatBufferBuilder builder,
      int movieId,
      int movieLength,
      int simulCommentsArrayOffset) {
    builder.startObject(3);
    Wall.addSimulCommentsArray(builder, simulCommentsArrayOffset);
    Wall.addMovieLength(builder, movieLength);
    Wall.addMovieId(builder, movieId);
    return Wall.endWall(builder);
  }

  public static void startWall(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addMovieId(FlatBufferBuilder builder, int movieId) { builder.addInt(0, movieId, 0); }
  public static void addMovieLength(FlatBufferBuilder builder, int movieLength) { builder.addInt(1, movieLength, 0); }
  public static void addSimulCommentsArray(FlatBufferBuilder builder, int simulCommentsArrayOffset) { builder.addOffset(2, simulCommentsArrayOffset, 0); }
  public static int createSimulCommentsArrayVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSimulCommentsArrayVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endWall(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishWallBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}


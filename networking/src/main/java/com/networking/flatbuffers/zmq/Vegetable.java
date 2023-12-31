// automatically generated by the FlatBuffers compiler, do not modify

package com.networking.flatbuffers.zmq;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Vegetable extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Vegetable getRootAsVegetable(ByteBuffer _bb) { return getRootAsVegetable(_bb, new Vegetable()); }
  public static Vegetable getRootAsVegetable(ByteBuffer _bb, Vegetable obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Vegetable __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float tomato() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float cucumber() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float lettuce() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createVegetable(FlatBufferBuilder builder,
      float tomato,
      float cucumber,
      float lettuce) {
    builder.startTable(3);
    Vegetable.addLettuce(builder, lettuce);
    Vegetable.addCucumber(builder, cucumber);
    Vegetable.addTomato(builder, tomato);
    return Vegetable.endVegetable(builder);
  }

  public static void startVegetable(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addTomato(FlatBufferBuilder builder, float tomato) { builder.addFloat(0, tomato, 0.0f); }
  public static void addCucumber(FlatBufferBuilder builder, float cucumber) { builder.addFloat(1, cucumber, 0.0f); }
  public static void addLettuce(FlatBufferBuilder builder, float lettuce) { builder.addFloat(2, lettuce, 0.0f); }
  public static int endVegetable(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Vegetable get(int j) { return get(new Vegetable(), j); }
    public Vegetable get(Vegetable obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


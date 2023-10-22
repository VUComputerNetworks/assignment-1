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
public final class Order extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static Order getRootAsOrder(ByteBuffer _bb) { return getRootAsOrder(_bb, new Order()); }
  public static Order getRootAsOrder(ByteBuffer _bb, Order obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Order __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.networking.flatbuffers.zmq.Vegetable veggies(int j) { return veggies(new com.networking.flatbuffers.zmq.Vegetable(), j); }
  public com.networking.flatbuffers.zmq.Vegetable veggies(com.networking.flatbuffers.zmq.Vegetable obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int veggiesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Vegetable.Vector veggiesVector() { return veggiesVector(new com.networking.flatbuffers.zmq.Vegetable.Vector()); }
  public com.networking.flatbuffers.zmq.Vegetable.Vector veggiesVector(com.networking.flatbuffers.zmq.Vegetable.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.networking.flatbuffers.zmq.Drink drinks(int j) { return drinks(new com.networking.flatbuffers.zmq.Drink(), j); }
  public com.networking.flatbuffers.zmq.Drink drinks(com.networking.flatbuffers.zmq.Drink obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int drinksLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Drink.Vector drinksVector() { return drinksVector(new com.networking.flatbuffers.zmq.Drink.Vector()); }
  public com.networking.flatbuffers.zmq.Drink.Vector drinksVector(com.networking.flatbuffers.zmq.Drink.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.networking.flatbuffers.zmq.Bottle bottles(int j) { return bottles(new com.networking.flatbuffers.zmq.Bottle(), j); }
  public com.networking.flatbuffers.zmq.Bottle bottles(com.networking.flatbuffers.zmq.Bottle obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int bottlesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Bottle.Vector bottlesVector() { return bottlesVector(new com.networking.flatbuffers.zmq.Bottle.Vector()); }
  public com.networking.flatbuffers.zmq.Bottle.Vector bottlesVector(com.networking.flatbuffers.zmq.Bottle.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.networking.flatbuffers.zmq.Milk milk(int j) { return milk(new com.networking.flatbuffers.zmq.Milk(), j); }
  public com.networking.flatbuffers.zmq.Milk milk(com.networking.flatbuffers.zmq.Milk obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int milkLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Milk.Vector milkVector() { return milkVector(new com.networking.flatbuffers.zmq.Milk.Vector()); }
  public com.networking.flatbuffers.zmq.Milk.Vector milkVector(com.networking.flatbuffers.zmq.Milk.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.networking.flatbuffers.zmq.Bread bread(int j) { return bread(new com.networking.flatbuffers.zmq.Bread(), j); }
  public com.networking.flatbuffers.zmq.Bread bread(com.networking.flatbuffers.zmq.Bread obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int breadLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Bread.Vector breadVector() { return breadVector(new com.networking.flatbuffers.zmq.Bread.Vector()); }
  public com.networking.flatbuffers.zmq.Bread.Vector breadVector(com.networking.flatbuffers.zmq.Bread.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.networking.flatbuffers.zmq.Meat meat(int j) { return meat(new com.networking.flatbuffers.zmq.Meat(), j); }
  public com.networking.flatbuffers.zmq.Meat meat(com.networking.flatbuffers.zmq.Meat obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int meatLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public com.networking.flatbuffers.zmq.Meat.Vector meatVector() { return meatVector(new com.networking.flatbuffers.zmq.Meat.Vector()); }
  public com.networking.flatbuffers.zmq.Meat.Vector meatVector(com.networking.flatbuffers.zmq.Meat.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createOrder(FlatBufferBuilder builder,
      int veggiesOffset,
      int drinksOffset,
      int bottlesOffset,
      int milkOffset,
      int breadOffset,
      int meatOffset) {
    builder.startTable(6);
    Order.addMeat(builder, meatOffset);
    Order.addBread(builder, breadOffset);
    Order.addMilk(builder, milkOffset);
    Order.addBottles(builder, bottlesOffset);
    Order.addDrinks(builder, drinksOffset);
    Order.addVeggies(builder, veggiesOffset);
    return Order.endOrder(builder);
  }

  public static void startOrder(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addVeggies(FlatBufferBuilder builder, int veggiesOffset) { builder.addOffset(0, veggiesOffset, 0); }
  public static int createVeggiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVeggiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDrinks(FlatBufferBuilder builder, int drinksOffset) { builder.addOffset(1, drinksOffset, 0); }
  public static int createDrinksVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startDrinksVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addBottles(FlatBufferBuilder builder, int bottlesOffset) { builder.addOffset(2, bottlesOffset, 0); }
  public static int createBottlesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBottlesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMilk(FlatBufferBuilder builder, int milkOffset) { builder.addOffset(3, milkOffset, 0); }
  public static int createMilkVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMilkVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addBread(FlatBufferBuilder builder, int breadOffset) { builder.addOffset(4, breadOffset, 0); }
  public static int createBreadVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBreadVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMeat(FlatBufferBuilder builder, int meatOffset) { builder.addOffset(5, meatOffset, 0); }
  public static int createMeatVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMeatVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endOrder(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Order get(int j) { return get(new Order(), j); }
    public Order get(Order obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

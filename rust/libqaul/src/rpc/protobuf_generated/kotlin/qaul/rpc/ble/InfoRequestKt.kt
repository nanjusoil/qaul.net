//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_rpc.proto

package qaul.rpc.ble;

@kotlin.jvm.JvmSynthetic
public inline fun infoRequest(block: qaul.rpc.ble.InfoRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.InfoRequest =
  qaul.rpc.ble.InfoRequestKt.Dsl._create(qaul.rpc.ble.BleRpc.InfoRequest.newBuilder()).apply { block() }._build()
public object InfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: qaul.rpc.ble.BleRpc.InfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.ble.BleRpc.InfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.ble.BleRpc.InfoRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun qaul.rpc.ble.BleRpc.InfoRequest.copy(block: qaul.rpc.ble.InfoRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.InfoRequest =
  qaul.rpc.ble.InfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

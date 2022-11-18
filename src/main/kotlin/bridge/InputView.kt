package bridge

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 *
 * 제공된 InputView 클래스를 활용해 구현해야 한다.
 * InputView의 패키지는 변경할 수 있다.
 * InputView의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
 * 사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.
 * InputView 클래스에서만 camp.nextstep.edu.missionutils.Console 의 readLine() 메서드를 이용해 사용자의 입력을 받을 수 있다.
 *
 */
class InputView {
    /**
     * 다리의 길이를 입력받는다.
     * BridgeMaker 으로 인자를 보내고 값을 받는다
     * 표시
     */
    fun readBridgeSize(): Int {
        val bridgeSize = readLine()!!.toInt()
        println(bridgeSize)
        return bridgeSize
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     * BridgeGame 으로 인자를 보내고 값을 받는다
     * 표시
     */
    fun readMoving(): String {
        val moving = readLine()!!
        println(moving)
        return moving
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     * BridgeGame 으로 인자를 보내고 값을 받는다
     * 표시
     */
    fun readGameCommand(): String {
        val gameCommand = readLine()!!
        println(gameCommand)
        return gameCommand
    }
}

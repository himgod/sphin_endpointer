# sphin_endpointer
这是语音处理中pipeline流水线处理中一部分代码，主是前的
VAD（Voice Activity Detector）静音检测算法，其中主实现了speech和non-speech区域的断点检测．
算法来为Bent Schmidt Nielsen，主要思想是在语音流中插入了SPEECH_START和SPEECH_END信号．主分三：
其一便判别每一帧是否为speech，其二mark出speech区域和non-speech区域．其三过滤掉non-speech区

实现来源为CMU-Sphnix.

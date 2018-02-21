1) done:the xml config file imported via ImportResource by the config included to spring.factories is ignored
2) strange situation with configuration that has ComponentScan annotation and ConditionalOnBean condition, if
the required bean is not included to its own scanned scope
3)done: scanned components not annotated with configuration are ignored
4) done:conditionalonproperty: condition on inner configuration class is ignored (see ConfigComponent11)
module com.packt.service.impl {
	requires com.packt.service.api;
	provides com.packt.service.api.NotificationService with com.packt.service.impl.SMSServiceImpl;
}